package com.example.pokelister.controllers;

import com.example.pokelister.models.User;
import com.example.pokelister.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class LoginController {
    private final UserRepository userDao;

    public LoginController(UserRepository userDao){this.userDao = userDao;}
    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam(name = "username") String username,
                            @RequestParam (name = "password") String password,
                            Model model) {
        model.addAttribute(username);
        model.addAttribute(password);

        User user = userDao.findUserByUsernameAndPassword(username, password);

        if(user == null) {
            model.addAttribute("loginError", "either the username or password you provided were incorrect");
            return "login";
        } else {
            model.addAttribute("isLoggedIn", true);
            model.addAttribute("name", user.getUsername());

            model.addAttribute("user", user);

            System.out.println(user.getUsername());
            System.out.println(user.getPassword());
        }

        return "profile";
    }

}
