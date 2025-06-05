package com.imana47.flowatch.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flowatch Garage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Onglets
        JTabbedPane onglets = new JTabbedPane();
        onglets.addTab("Liste Voitures", new ListeVoituresPanel());
        onglets.addTab("Ajouter Voiture", new AjouterVoiturePanel());

        frame.add(onglets);
        frame.setVisible(true);
    }
}