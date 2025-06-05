package com.imana47.flowatch.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import com.imana47.flowatch.model.Voiture;
import com.imana47.flowatch.service.VoitureService;

public class AjouterVoiturePanel extends JPanel {
    private JTextField marqueField, modeleField, anneeField, prixField;
    private VoitureService service = new VoitureService();

    public AjouterVoiturePanel() {
        setLayout(new GridLayout(5, 2));

        add(new JLabel("Marque:"));
        marqueField = new JTextField();
        add(marqueField);

        add(new JLabel("Modèle:"));
        modeleField = new JTextField();
        add(modeleField);

        add(new JLabel("Année:"));
        anneeField = new JTextField();
        add(anneeField);

        add(new JLabel("Prix:"));
        prixField = new JTextField();
        add(prixField);

        JButton ajouterBtn = new JButton("Ajouter");
        ajouterBtn.addActionListener(this::ajouterVoiture);
        add(ajouterBtn);
    }

    private void ajouterVoiture(ActionEvent e) {
        Voiture voiture = new Voiture();
        voiture.setMarque(marqueField.getText());
        voiture.setModele(modeleField.getText());
        voiture.setAnnee(Integer.parseInt(anneeField.getText()));
        voiture.setPrix(Double.parseDouble(prixField.getText()));

        service.ajouterVoiture(voiture);
        JOptionPane.showMessageDialog(this, "Voiture ajoutée !");
    }
}