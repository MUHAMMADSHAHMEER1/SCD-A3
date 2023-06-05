/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scdassignment3;

/**
 *
 * @author najeeb
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoomInformationForm extends JFrame {
    private JTextField roomNoField, roomChargesField;
    private JComboBox<String> roomTypeDropdown, roomStatusDropdown;
    private JButton newButton, saveButton, updateButton, deleteButton, getDataButton;
    private JTable dataTable;
    private DefaultTableModel tableModel;

    public RoomInformationForm() {
      
        setTitle("Room Information Form");

        JLabel roomNoLabel = new JLabel("Room No:");
        JLabel roomTypeLabel = new JLabel("Room Type:");
        JLabel roomChargesLabel = new JLabel("Room Charges (per day):");
        JLabel roomStatusLabel = new JLabel("Room Status:");

        roomNoField = new JTextField(10);
        roomChargesField = new JTextField(10);
        String[] roomTypes = {"General", "Deluxe"};
        roomTypeDropdown = new JComboBox<>(roomTypes);
        String[] roomStatuses = {"Vacant", "Booked"};
        roomStatusDropdown = new JComboBox<>(roomStatuses);
        newButton = new JButton("New");
        saveButton = new JButton("Save");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        getDataButton = new JButton("Get Data");
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Room No");
        tableModel.addColumn("Room Type");
        tableModel.addColumn("Room Charges");
        tableModel.addColumn("Room Status");
        dataTable = new JTable(tableModel);
        
        JScrollPane scrollPane = new JScrollPane(dataTable);
        JPanel panel = new JPanel(new GridLayout(8, 2));
        panel.add(roomNoLabel);
        panel.add(roomNoField);
        panel.add(roomTypeLabel);
        panel.add(roomTypeDropdown);
        panel.add(roomChargesLabel);
        panel.add(roomChargesField);
        panel.add(roomStatusLabel);
        panel.add(roomStatusDropdown);
        panel.add(newButton);
        panel.add(saveButton);
        panel.add(updateButton);
        panel.add(deleteButton);
        panel.add(getDataButton);

        
        getContentPane().add(panel, BorderLayout.NORTH);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

      
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String roomNo = roomNoField.getText();
                String roomType = (String) roomTypeDropdown.getSelectedItem();
                String roomCharges = roomChargesField.getText();
                String roomStatus = (String) roomStatusDropdown.getSelectedItem();

                Object[] rowData = {roomNo, roomType, roomCharges, roomStatus};
                tableModel.addRow(rowData);

                if (roomStatus.equals("Vacant")) {
                    roomStatusDropdown.setSelectedItem("Booked");
                }
            }
        });

       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

 
