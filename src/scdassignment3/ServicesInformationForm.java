/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scdassignment3;

/**
 *
 * @author shameer
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServicesInformationForm extends JFrame {
    private JLabel serviceNameLabel, serviceDateLabel, patientIdLabel, patientNameLabel, serviceChargesLabel;
    private JTextField serviceNameField, serviceDateField, patientIdField, patientNameField, serviceChargesField;
    private JButton newButton, saveButton, deleteButton, updateButton, getDataButton;
    private JTable dataTable;

    public ServicesInformationForm() {
        // Set the window title
        setTitle("Services Information");

        // Create labels
        serviceNameLabel = new JLabel("Service Name:");
        serviceDateLabel = new JLabel("Service Date:");
        patientIdLabel = new JLabel("Patient ID:");
        patientNameLabel = new JLabel("Patient Name:");
        serviceChargesLabel = new JLabel("Service Charges:");

        // Create text fields
        serviceNameField = new JTextField(20);
        serviceDateField = new JTextField(20);
        patientIdField = new JTextField(20);
        patientNameField = new JTextField(20);
        serviceChargesField = new JTextField(20);

        // Create buttons
        newButton = new JButton("New");
        saveButton = new JButton("Save");
        deleteButton = new JButton("Delete");
        updateButton = new JButton("Update");
        getDataButton = new JButton("Get Data");

        // Create a table to display patient information
        dataTable = new JTable();

        // Create a panel to hold the components
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5, 5, 5, 5);

        panel.add(serviceNameLabel, constraints);
        constraints.gridy = 1;
        panel.add(serviceDateLabel, constraints);
        constraints.gridy = 2;
        panel.add(patientIdLabel, constraints);
        constraints.gridy = 3;
        panel.add(patientNameLabel, constraints);
        constraints.gridy = 4;
        panel.add(serviceChargesLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(serviceNameField, constraints);
        constraints.gridy = 1;
        panel.add(serviceDateField, constraints);
        constraints.gridy = 2;
        panel.add(patientIdField, constraints);
        constraints.gridy = 3;
        panel.add(patientNameField, constraints);
        constraints.gridy = 4;
        panel.add(serviceChargesField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        panel.add(newButton, constraints);
        constraints.gridx = 1;
        panel.add(saveButton, constraints);
        constraints.gridx = 2;
        panel.add(deleteButton, constraints);
        constraints.gridx = 3;
        panel.add(updateButton, constraints);
        constraints.gridx = 4;
        panel.add(getDataButton, constraints);

        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 5;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.insets = new Insets(10, 5, 5, 5);
        panel.add(new JScrollPane(dataTable), constraints);

        // Add the panel to the content pane
        getContentPane().add(panel);

        // Set the default close operation and display the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
