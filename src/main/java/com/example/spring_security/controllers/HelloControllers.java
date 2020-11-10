package com.example.spring_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllers {

    @GetMapping("/helloo")
    public String helloo() {
        return "Helloo";
    }

    @GetMapping("/helloo/admin")
    public String hellooAdmin() {
        return "Helloo Admin";
    }
}
