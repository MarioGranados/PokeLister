package com.example.pokelister.controllers;

import com.example.pokelister.models.Catagory;
import com.example.pokelister.repositories.CatagoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatagoryController {

    private CatagoryRepository catagoryDao;

    public CatagoryController(CatagoryRepository catagoryDao) {
        this.catagoryDao = catagoryDao;
    }

    @GetMapping("/category")
    public String showCatagories(Model model) {
        model.addAttribute( "categories" ,catagoryDao.findAll());
        return "partials/categories";

    }
}
