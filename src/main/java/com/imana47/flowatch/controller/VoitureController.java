package com.imana47.flowatch.controller;

import com.imana47.flowatch.model.Voiture;
import com.imana47.flowatch.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/voitures")
public class VoitureController {
    private final VoitureService service;

    // Injection par constructeur (recommandé)
    @Autowired
    public VoitureController(VoitureService service) {
        this.service = service;
    }

    @GetMapping
    public List<Voiture> lister() {
        return service.listerVoitures();
    }

    @GetMapping("/marque/{marque}")
    public List<Voiture> parMarque(@PathVariable String marque) {
        return service.trouverParMarque(marque);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        service.supprimerVoiture(id);
    }
}