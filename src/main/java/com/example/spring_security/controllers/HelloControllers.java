package com.example.spring_security.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllers {

    @GetMapping("/helloo")
    public ResponseEntity<?> helloo() {
        return ResponseEntity.ok("Helloo");
    }

    @GetMapping("/helloo/admin")
    public ResponseEntity<?> hellooAdmin() {
        return ResponseEntity.ok("Helloo Admin");
    }
}
