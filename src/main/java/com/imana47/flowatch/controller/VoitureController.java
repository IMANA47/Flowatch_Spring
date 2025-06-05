package com.imana47.flowatch.controller;

import com.imana47.flowatch.model.Voiture;
import com.imana47.flowatch.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/voitures")
public class VoitureController {
    @Autowired
    private VoitureService service;

    @PostMapping
    public Voiture ajouter(@RequestBody Voiture voiture) {
        return service.ajouterVoiture(voiture);
    }

    @GetMapping
    public List<Voiture> lister() {
        return service.listerVoitures();
    }
}