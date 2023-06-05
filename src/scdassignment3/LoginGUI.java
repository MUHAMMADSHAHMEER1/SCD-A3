/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scdassignment3;

/*import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;*/

/**
 *
 * @author najeeb
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginGUI() {
        
        setTitle("Login Page");

    
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);

      
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);

       
        loginButton = new JButton("Login");

    
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

      
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (validateLogin(username, password)) {
                    JOptionPane.showMessageDialog(LoginGUI.this, "Login successful!");

                    ActionSelectionForm sa = new ActionSelectionForm();
                   
                } else {
                    JOptionPane.showMessageDialog(LoginGUI.this, "Invalid username or password. Please try again.");
                }
            }
        });

       
        getContentPane().add(panel);

        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false); 
        setVisible(true);
    }

    private boolean validateLogin(String username, String password) {
       
        return username.equals("admin") && password.equals("123");
    }
}



