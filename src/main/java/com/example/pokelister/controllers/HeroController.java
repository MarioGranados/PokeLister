package com.example.pokelister.controllers;

import com.example.pokelister.repositories.CatagoryRepository;
import com.example.pokelister.repositories.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeroController {
    private ProductRepository productsDao;
    private CatagoryRepository catDao;

    public HeroController(ProductRepository productsDao, CatagoryRepository catDao) {
        this.productsDao = productsDao;
        this.catDao = catDao;
    }

    @GetMapping("/")
    public String hero(Model model) {
        model.addAttribute("products", productsDao.findAll());
        model.addAttribute("categories", catDao.findAll());
        return "index";
    }
}
