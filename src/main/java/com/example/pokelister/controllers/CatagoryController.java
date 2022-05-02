package com.example.pokelister.controllers;

import com.example.pokelister.repositories.CatagoryRepository;
import com.example.pokelister.repositories.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;

@Controller
public class CatagoryController {

    private CatagoryRepository catagoryDao;
    private ProductRepository prodDao;

    public CatagoryController(CatagoryRepository catagoryDao, ProductRepository prodDao) {
        this.catagoryDao = catagoryDao;
        this.prodDao = prodDao;
    }

    @GetMapping("/category")
    public String showCatagories(Model model) {
        model.addAttribute( "categories", catagoryDao.findAll());
        return "results";
    }
    @PostMapping("/category")
    public String postCat(@RequestParam(name = "category_id") long id, Model model) {
        model.addAttribute("categories", catagoryDao.findAll());
        model.addAttribute("products", prodDao.findByCategoryId(id));
        return "results";
    }
}
