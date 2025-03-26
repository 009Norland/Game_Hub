package com.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame {
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField emailField;
    private JPasswordField passwordField;

    public SignUp() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Game Hub - Sign Up");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);

        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // First Name
        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setBounds(10, 20, 100, 25);
        panel.add(firstNameLabel);

        firstNameField = new JTextField(20);
        firstNameField.setBounds(120, 20, 165, 25);
        panel.add(firstNameField);

        // Last Name
        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setBounds(10, 60, 100, 25);
        panel.add(lastNameLabel);

        lastNameField = new JTextField(20);
        lastNameField.setBounds(120, 60, 165, 25);
        panel.add(lastNameField);

        // Email
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(10, 100, 100, 25);
        panel.add(emailLabel);

        emailField = new JTextField(20);
        emailField.setBounds(120, 100, 165, 25);
        panel.add(emailField);

        // Password
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 140, 100, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(120, 140, 165, 25);
        panel.add(passwordField);

        // Sign Up Button
        JButton signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(10, 180, 80, 25);
        panel.add(signUpButton);

        // Back to Login Button
        JButton backButton = new JButton("Back to Login");
        backButton.setBounds(100, 180, 150, 25);
        panel.add(backButton);

        // Action listener for the Sign Up button
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Here you can add sign-up logic
                JOptionPane.showMessageDialog(null, "Sign Up Successful!");
                Home homeFrame = new Home();
                homeFrame.setVisible(true);
                dispose(); // Close the sign-up frame
            }
        });

        // Action listener for the Back button
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login loginFrame = new Login();
                loginFrame.setVisible(true);
                dispose(); // Close the sign-up frame
            }
        });
    }

    public static void main(String[] args) {
        new SignUp();
    }
}