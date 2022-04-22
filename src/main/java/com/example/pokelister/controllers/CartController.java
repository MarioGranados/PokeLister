package com.example.pokelister.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CartController {
    @GetMapping("/cart")
    public String showCart(){
        return "cart";
    }

    @PostMapping("/cart/purchase")
    public String buyNow() {
        return "confirm";
    }
}
