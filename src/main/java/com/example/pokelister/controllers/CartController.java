package com.example.pokelister.controllers;

import com.example.pokelister.models.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CartController {
    @GetMapping("/cart")
    public String showCart(){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (user == null) {
            return "cart";
        } else {
            return "login";
        }
    }

    @PostMapping("/cart/purchase")
    public String buyNow() {
        return "confirm";
    }
}
