package com.example.pokelister.controllers;

import com.example.pokelister.models.User;
import com.example.pokelister.repositories.CatagoryRepository;
import com.example.pokelister.repositories.ProductRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserProfileController {
    private ProductRepository productDao;
    private CatagoryRepository catDao;

    public UserProfileController(ProductRepository productDao, CatagoryRepository catDao) {
        this.productDao = productDao;
        this.catDao = catDao;
    }

    @GetMapping("/profile")
    public String showProfile(Model model) {
        model.addAttribute("products", productDao.findAll());
        model.addAttribute("categories", catDao.findAll());
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("user", user);
        return "profile";
    }
}
