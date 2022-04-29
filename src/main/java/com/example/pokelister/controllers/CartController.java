package com.example.pokelister.controllers;

import com.example.pokelister.models.Cart;
import com.example.pokelister.models.Product;
import com.example.pokelister.models.User;
import com.example.pokelister.repositories.CartRepository;
import com.example.pokelister.repositories.ProductRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CartController {
    private CartRepository cartDao;
    private ProductRepository productDao;
    static int counter = 1;

    public CartController(CartRepository cardDao, ProductRepository productDao) {
        this.cartDao = cardDao;
        this.productDao = productDao;
    }

    @GetMapping("/cart")
    public String showCart(Model model) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Cart cart = (Cart) cartDao.findAll();
        Product product = (Product) productDao.findAll();
        model.addAttribute("products", product);
        return "index";
    }

    @PostMapping("/cart/addtocart")
    public String addToCart(@RequestParam(name = "add_id") long id, Model model) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Product product = productDao.getById(id);
        cartDao.save(new Cart( user.getId(), product));
        return "redirect:/";
    }

    @GetMapping("/cart/checkout")
    private String showReview(Model model) {
        return "checkout";
    }
}
