package com.imana47.flowatch.service;


import com.imana47.flowatch.model.Voiture;
import com.imana47.flowatch.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VoitureService {
@Autowired
    private VoitureRepository repository;

    public Voiture ajouterVoiture(Voiture voiture) {
        return repository.save(voiture);
    }

    public List<Voiture> listerVoitures() {
        return repository.findAll();
    }

    public List<Voiture> rechercherParMarque(String marque) {
        return repository.findByMarque(marque);
    }

    public List<Voiture> rechercherParAnnee(int annee) {
        return repository.findByAnneeGreaterThan(annee);
    }
}
