package com.barasa.learn.controller;

import org.springframework.web.bind.annotation.*;
import com.barasa.learn.entity.User;
import com.barasa.learn.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("user", new User()); // <--- THIS LINE
        model.addAttribute("message", "Add a new user below:");
        return "hellox"; // name of Thymeleaf template
    }

    // Handle form submission
    @PostMapping
    public String createUser(@ModelAttribute User user, Model model) {
        service.create(user);
        model.addAttribute("user", new User()); // reset form
        model.addAttribute("feedback", "User " + user.getName() + " added successfully!");
        model.addAttribute("message", "Add another user:");
        return "hello"; // reload same template
    }
}
