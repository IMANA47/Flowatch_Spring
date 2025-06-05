package com.imana47.flowatch.ui;

import com.imana47.flowatch.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class MainUI extends JFrame {
    private final VoitureService voitureService;

    @Autowired
    public MainUI(VoitureService voitureService) {
        this.voitureService = voitureService;
        initUI();
    }

    private void initUI() {
        setTitle("Flowatch Garage");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        JTabbedPane onglets = new JTabbedPane();
        onglets.addTab("Liste Voitures", new ListeVoituresPanel(voitureService));
        onglets.addTab("Ajouter Voiture", new AjouterVoiturePanel(voitureService));

        add(onglets);
    }
}