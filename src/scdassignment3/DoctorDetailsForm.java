/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scdassignment3;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author shameer
 */
public class DoctorDetailsForm extends JFrame {
    private JTextField idField, fullNameField, fatherNameField, emailField, contactNoField, addressField;
    private JComboBox<String> qualificationDropdown, genderDropdown, bloodGroupDropdown;
    private JSpinner dateOfBirthSpinner;
    private JButton saveButton, updateButton, newButton, getDataButton;

    public DoctorDetailsForm() {
 
        setTitle("Doctor Details Form");
        
        JLabel idLabel = new JLabel("Doctor's ID:");
        JLabel fullNameLabel = new JLabel("Full Name:");
        JLabel fatherNameLabel = new JLabel("Father's Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel contactNoLabel = new JLabel("Contact No.:");
        JLabel addressLabel = new JLabel("Address:");
        JLabel qualificationLabel = new JLabel("Qualification:");
        JLabel genderLabel = new JLabel("Gender:");
        JLabel bloodGroupLabel = new JLabel("Blood Group:");
        JLabel dateOfBirthLabel = new JLabel("Date of Joining:");

   
        idField = new JTextField(20);
        fullNameField = new JTextField(20);
        fatherNameField = new JTextField(20);
        emailField = new JTextField(20);
        contactNoField = new JTextField(20);
        addressField = new JTextField(20);
        
        String[] qualifications = {"MBBS", "MD", "MS"};
        qualificationDropdown = new JComboBox<>(qualifications);

        String[] genders = {"Male", "Female", "Other"};
        genderDropdown = new JComboBox<>(genders);

        String[] bloodGroups = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
        bloodGroupDropdown = new JComboBox<>(bloodGroups);

        SpinnerDateModel dateModel = new SpinnerDateModel();
        dateOfBirthSpinner = new JSpinner(dateModel);
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateOfBirthSpinner, "yyyy-MM-dd");
        dateOfBirthSpinner.setEditor(dateEditor);

        // Create buttons
        saveButton = new JButton("Save");
        updateButton = new JButton("Update");
        newButton = new JButton("New");
        getDataButton = new JButton("Get Data");

        JPanel panel = new JPanel(new GridLayout(12, 2));
        panel.add(idLabel);
        panel.add(idField);
        panel.add(fullNameLabel);
        panel.add(fullNameField);
        panel.add(fatherNameLabel);
        panel.add(fatherNameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(contactNoLabel);
        panel.add(contactNoField);
        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(qualificationLabel);
        panel.add(qualificationDropdown);
        panel.add(genderLabel);
        panel.add(genderDropdown);
        panel.add(bloodGroupLabel);
        panel.add(bloodGroupDropdown);
        panel.add(dateOfBirthLabel);
        panel.add(dateOfBirthSpinner);
        panel.add(saveButton);
        panel.add(updateButton);
        panel.add(newButton);
        panel.add(getDataButton);

        getContentPane().add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
         setLocationRelativeTo(null); 
        setVisible(true);
                }
}

