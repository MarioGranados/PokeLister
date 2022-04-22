package com.example.pokelister.controllers;

import com.example.pokelister.models.Product;
import com.example.pokelister.repositories.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    private ProductRepository productDao;
    public AdminController(ProductRepository productDao) {
        this.productDao = productDao;
    }

/*    @GetMapping("/admin")
    public String showAdminPage() {
        return "admin";
    }*/

    @GetMapping("/create")
    public String showCreateProduct(){
        return "create";
    }

    @PostMapping("/create")
    public String createProduct(@RequestParam(name = "title") String title,
                                @RequestParam (name = "description") String desc,
                                @RequestParam(name = "price") long price,
                                @RequestParam(name = "quantity") long quantity,
                                Model model) {

        model.addAttribute(title);
        model.addAttribute(desc);
        model.addAttribute(price);
        model.addAttribute(quantity);

        productDao.save(new Product(title, desc, price, quantity));
        return "create";
    }
/*
    @PostMapping("admin/products/delete")
    public String deleteProduct() {
        return "admin";
    }

    @PostMapping("admin/products/pricing")
    public String editPricing() {
        return "admin";
    }

    @PostMapping("admin/create/admin")
    public String postAdmin() {
        return "admin";
    }*/
}
