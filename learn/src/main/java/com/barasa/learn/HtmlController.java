package com.barasa.learn;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("/hello-html")
    public String helloHtml(Model model) {
        model.addAttribute("message", "Hello from Thymeleaf!");
        return "hello";
    }
}
