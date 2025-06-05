package com.imana47.flowatch.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Voiture {
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marque;
    private String modele;
    private int annee;
    private double prix;

    // Getters/Setters
    public Long getId() { return id; }
    public String getMarque() { return marque; }
    public String getModele() { return modele; }
    public int getAnnee() { return annee; }
    public double getPrix() { return prix; }
}
