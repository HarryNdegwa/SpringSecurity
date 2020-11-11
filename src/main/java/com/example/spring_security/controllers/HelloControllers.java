package com.example.spring_security.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllers {

    @GetMapping("/helloo")
    public ResponseEntity<?> helloo() {
        List<String> names = new ArrayList<>();
        names.add("Hey");
        names.add("Great");
        return ResponseEntity.ok().body(names);
    }

    @GetMapping("/helloo/admin")
    public ResponseEntity<?> hellooAdmin() {
        return ResponseEntity.ok("Helloo Admin");
    }
}
