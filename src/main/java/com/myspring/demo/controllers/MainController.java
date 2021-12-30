package com.myspring.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String homeMethod(Model model) {
        model.addAttribute("title", "The general page");
        return "home";
    }

    @GetMapping("/about")
    public String aboutMethod(Model model) {
        model.addAttribute("title", "About page");
        return "about";

    }
}