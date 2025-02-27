package org.example.jekinstest.controller;

import org.example.jekinstest.model.User;
import org.example.jekinstest.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<User> users = userService.getUsers();
        model.addAttribute("users", users);
        return "index";
    }

    @PostMapping("/")
    public String homes(Model model) {
        List<User> users = userService.getUsers();
        model.addAttribute("users", users);
        return "index";
    }
}
