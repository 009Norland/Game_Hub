package com.example;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Home extends JFrame {
    public Home() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Home");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);

        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel welcomeLabel = new JLabel("Welcome to the Home Page!");
        welcomeLabel.setBounds(100, 50, 200, 25);
        panel.add(welcomeLabel);
    }

    public static void main(String[] args) {
        new Home();
    }
}