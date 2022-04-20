package com.example.pokelister.controllers;

import com.example.pokelister.models.User;
import com.example.pokelister.repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.PasswordAuthentication;

@Controller
@SessionAttributes("user")
public class RegisterController {
    private PasswordEncoder passwordEncoder;
    private UserRepository userDao;

    public RegisterController(UserRepository usersDao, PasswordEncoder passwordEncoder) {
        this.userDao = usersDao;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String postRegister(@RequestParam(name = "password") String password,
                               @RequestParam(name = "confirm_password") String confirmPass,
                               @ModelAttribute User user, Model model) {

        if (password.equals(confirmPass)) {
            String hash = passwordEncoder.encode(user.getPassword());
            user.setPassword(hash);
            userDao.save(user);
            return "login";
        } else {
            model.addAttribute("error", "Passwords did not match");
            return "register";
        }
    }

}
