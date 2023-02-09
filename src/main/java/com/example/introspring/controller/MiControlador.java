package com.example.introspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class MiControlador {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("hora", LocalDateTime.now());
        return "index";
    }
}
