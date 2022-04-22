package com.example.pokelister.controllers;

import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class AdminController {
    @GetMapping
    public String showAdminPage() {
        return "admin";
    }

    @PostMapping("/products/create")
    public String createProduct() {
        return "admin";
    }

    @PostMapping("/products/delete")
    public String deleteProduct() {
        return "admin";
    }

    @PostMapping("/products/pricing")
    public String editPricing() {
        return "admin";
    }

    @PostMapping("/make/admin")
    public String postAdmin() {
        return "admin";
    }
}
