package com.imana47.flowatch.repository;


import com.imana47.flowatch.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
    List<Voiture> findByMarque(String marque);
    List<Voiture> findByAnneeGreaterThan(int annee);  // Requête dérivée
}