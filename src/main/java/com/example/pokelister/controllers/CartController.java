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
        model.addAttribute("products", productDao.findAll());
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("cart", cartDao.findAll());
        if (user == null) {
            return "index";
        } else {
            return "index";
        }
    }

    @PostMapping("/cart/addtocart")
    public String addToCart(@RequestParam(name = "add_id") long id, Model model) {
        Product product = productDao.getById(id);
        model.addAttribute("carts", counter);
        counter++;
        cartDao.save(new Cart(product.getId()));
        return "index";
    }

    @GetMapping("/cart/checkout")
    private String showReview(Model model) {
        return "checkout";
    }
}
