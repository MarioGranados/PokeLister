package com.example.pokelister.controllers;

import com.example.pokelister.models.Ad;
import com.example.pokelister.repositories.AdRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdController {

    private final AdRepository adDao;

    public AdController(AdRepository adDao) {
        this.adDao = adDao;
    }

    @GetMapping("/ads")
    public String index(Model model) {
        model.addAttribute("ads", adDao.findAll());
        return "/create_add";
    }

    @PostMapping("/ads/create")
    public String createAd(@RequestParam (name = "title") String title,
                           @RequestParam (name = "description") String desc,
                           Model model) {
        model.addAttribute(title);
        model.addAttribute(desc);

        adDao.save(new Ad(title, desc));
        return "/ads";
    }
}
