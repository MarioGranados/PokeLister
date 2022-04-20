package com.example.pokelister.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {
    @GetMapping("/search")
    public String getSearch() {
    return "tests";
    }
    @PostMapping("/search")
    public String postSearch(@RequestParam(name = "search") String search, Model model) {
        model.addAttribute(search);
        System.out.println(search);

        return "tests";
    }

}
