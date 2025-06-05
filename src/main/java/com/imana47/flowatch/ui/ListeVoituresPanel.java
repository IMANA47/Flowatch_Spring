package com.imana47.flowatch.ui;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import com.imana47.flowatch.model.Voiture;
import com.imana47.flowatch.service.VoitureService;

public class ListeVoituresPanel extends JPanel {
    private JTable table;
    private VoitureService service = new VoitureService();

    public ListeVoituresPanel() {
        setLayout(new BorderLayout());
        String[] colonnes = {"ID", "Marque", "Modèle", "Année", "Prix"};
        List<Voiture> voitures = service.listerVoitures();
        Object[][] data = new Object[voitures.size()][5];

        for (int i = 0; i < voitures.size(); i++) {
            data[i][0] = voitures.get(i).getId();
            data[i][1] = voitures.get(i).getMarque();
            data[i][2] = voitures.get(i).getModele();
            data[i][3] = voitures.get(i).getAnnee();
            data[i][4] = voitures.get(i).getPrix();
        }

        table = new JTable(data, colonnes);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }
}
