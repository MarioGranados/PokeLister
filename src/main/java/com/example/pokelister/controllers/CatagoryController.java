package com.example.pokelister.controllers;

import com.example.pokelister.models.Catagory;
import com.example.pokelister.repositories.CatagoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CatagoryController {

    private CatagoryRepository catagoryDao;

    public CatagoryController(CatagoryRepository catagoryDao) {
        this.catagoryDao = catagoryDao;
    }

    @GetMapping("/catagories")
    @ResponseBody
    public String showCatagories() {
        Catagory cat = catagoryDao.findAllByCatagoryName("yellow");
        return cat.getCatagoryName();

    }
}
