package com.example.pokelister.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeroController {
    @GetMapping("/")
    public String hero() {
        return "index";
    }
}
