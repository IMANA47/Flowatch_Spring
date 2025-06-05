package com.imana47.flowatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.imana47.flowatch.ui.MainUI;

@SpringBootApplication
public class FlowatchApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(FlowatchApplication.class)
                .headless(false).run(args);
        
        // Lancer l'interface Swing dans le thread EDT
        javax.swing.SwingUtilities.invokeLater(() -> {
            MainUI mainUI = ctx.getBean(MainUI.class);
            mainUI.setVisible(true);
        });
    }
}