package com.imana47.flowatch.ui;

import com.imana47.flowatch.service.VoitureService;
import javax.swing.*;
import java.awt.*;

public class ListeVoituresPanel extends JPanel {
    private JTable table;
    private VoitureService service;

    public ListeVoituresPanel(VoitureService service) {
        this.service = service;
        setLayout(new BorderLayout());
        chargerDonnees();
    }

    private void chargerDonnees() {
        String[] colonnes = {"ID", "Marque", "Modèle", "Année", "Prix"};
        Object[][] data = service.listerVoitures().stream()
            .map(v -> new Object[]{v.getId(), v.getMarque(), v.getModele(), v.getAnnee(), v.getPrix()})
            .toArray(Object[][]::new);

        table = new JTable(data, colonnes);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    public VoitureService getService() {
        return service;
    }

    public void setService(VoitureService service) {
        this.service = service;
    }
}