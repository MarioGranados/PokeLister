package com.example.pokelister.controllers;
import com.example.pokelister.models.User;
import com.example.pokelister.repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class LoginController {
    private UserRepository userDao;

    public LoginController(UserRepository userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

}
