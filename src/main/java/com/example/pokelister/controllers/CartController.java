package com.example.pokelister.controllers;

import com.example.pokelister.models.Cart;
import com.example.pokelister.models.User;
import com.example.pokelister.repositories.CartRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CartController {
    private CartRepository cardDao;

    public CartController(CartRepository cardDao) {
        this.cardDao =  cardDao;
    }

    @GetMapping("/cart")
    public String showCart(Model model){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("cart", cardDao.findAll());
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
