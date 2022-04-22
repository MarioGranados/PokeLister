package com.example.pokelister.controllers;
import com.example.pokelister.repositories.CatagoryRepository;
import com.example.pokelister.repositories.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class CatagoryController {

    private CatagoryRepository catagoryDao;

    public CatagoryController(ProductRepository categoryDao) {
        this.catagoryDao = catagoryDao;
    }

    @GetMapping("/products")
    public String index(@PathVariable String catagory, Model model) {
        model.addAttribute("products", catagoryDao.findAllByCatagoryName(catagory));
        return "products";
    }
}
