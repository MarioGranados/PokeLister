package com.example.pokelister.controllers;

import com.example.pokelister.repositories.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeroController {
    private ProductRepository productsDao;

    public HeroController(ProductRepository productsDao)  {this.productsDao = productsDao;}
    @GetMapping("/")
    public String hero(Model model) {
        model.addAttribute("products", productsDao.findAll());
        return "index";
    }
}
