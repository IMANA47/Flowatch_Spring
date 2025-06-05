package com.imana47.flowatch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Bienvenue dans Flowatch Garage! Utilisez /api/voitures pour accéder à l'API.";
    }
}
