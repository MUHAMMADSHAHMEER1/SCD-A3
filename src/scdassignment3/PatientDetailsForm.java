/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scdassignment3;

/**
 *
 * @author Shameer
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientDetailsForm extends JFrame {
    private JLabel patientIdLabel, nameLabel, fatherNameLabel, addressLabel, contactNoLabel, emailLabel, ageLabel,
            genderLabel, bloodGroupLabel;
    private JTextField patientIdField, nameField, fatherNameField, addressField, contactNoField, emailField;
    private JComboBox<String> ageComboBox, genderComboBox, bloodGroupComboBox;
    private JButton saveButton, updateButton, deleteButton, newButton, getDataButton;

    public PatientDetailsForm() {
        // Set the window title
        setTitle("Patient Details");
        patientIdLabel = new JLabel("Patient ID:");
        nameLabel = new JLabel("Name:");
        fatherNameLabel = new JLabel("Father's Name:");
        addressLabel = new JLabel("Address:");
        contactNoLabel = new JLabel("Contact No:");
        emailLabel = new JLabel("Email ID:");
        ageLabel = new JLabel("Age:");
        genderLabel = new JLabel("Gender:");
        bloodGroupLabel = new JLabel("Blood Group:");
        patientIdField = new JTextField(20);
        nameField = new JTextField(20);
        fatherNameField = new JTextField(20);
        addressField = new JTextField(20);
        contactNoField = new JTextField(20);
        emailField = new JTextField(20);
        ageComboBox = new JComboBox<>(new String[]{"18", "19", "20", "21", "22", "23", "24", "25"});
        genderComboBox = new JComboBox<>(new String[]{"Male", "Female", "Other"});
        bloodGroupComboBox = new JComboBox<>(new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});
        saveButton = new JButton("Save");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        newButton = new JButton("New");
        getDataButton = new JButton("Get Data");


        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5, 5, 5, 5);

        panel.add(patientIdLabel, constraints);
        constraints.gridy = 1;
        panel.add(nameLabel, constraints);
        constraints.gridy = 2;
        panel.add(fatherNameLabel, constraints);
        constraints.gridy = 3;
        panel.add(addressLabel, constraints);
        constraints.gridy = 4;
        panel.add(contactNoLabel, constraints);
        constraints.gridy = 5;
        panel.add(emailLabel, constraints);
        constraints.gridy = 6;
        panel.add(ageLabel, constraints);
        constraints.gridy = 7;
        panel.add(genderLabel, constraints);
        constraints.gridy = 8;
        panel.add(bloodGroupLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(patientIdField, constraints);
        constraints.gridy = 1;
        panel.add(nameField, constraints);
        constraints.gridy = 2;
        panel.add(fatherNameField, constraints);
        constraints.gridy = 3;
        panel.add(addressField, constraints);
        constraints.gridy = 4;
        panel.add(contactNoField, constraints);
        constraints.gridy = 5;
        panel.add(emailField, constraints);
        constraints.gridy = 6;
        panel.add(ageComboBox, constraints);
        constraints.gridy = 7;
        panel.add(genderComboBox, constraints);
        constraints.gridy = 8;
        panel.add(bloodGroupComboBox, constraints);

        constraints.gridy = 9;
        panel.add(saveButton, constraints);
        constraints.gridx = 2;
        panel.add(updateButton, constraints);
        constraints.gridx = 3;
        panel.add(deleteButton, constraints);
        constraints.gridx = 4;
        panel.add(newButton, constraints);
        constraints.gridx = 5;
        panel.add(getDataButton, constraints);
        getContentPane().add(panel);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
