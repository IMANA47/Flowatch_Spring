package com.imana47.flowatch.ui;

import com.imana47.flowatch.model.*;
import com.imana47.flowatch.service.VoitureService;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AjouterVoiturePanel extends JPanel {
    private VoitureService service;
    private JTextField marqueField, modeleField, anneeField, prixField;

    public AjouterVoiturePanel(VoitureService service) {
        this.service = service;
        initUI();
    }

    private void initUI() {
        setLayout(new GridLayout(5, 2));
        // ... (le reste du code reste identique)
    }

    public VoitureService getService() {
        return service;
    }

    public void setService(VoitureService service) {
        this.service = service;
    }
}