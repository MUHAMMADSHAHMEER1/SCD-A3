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

public class ActionSelectionForm extends JFrame {
    private JButton doctorDetailsButton, roomInformationButton, patientDetailButton, patientUpdateDeleteButton,
            patientAdmitInfoButton, servicesInfoButton;

    public ActionSelectionForm() {
      
        setTitle("Action Selection Form");

       
        doctorDetailsButton = new JButton("Doctor Details");
        roomInformationButton = new JButton("Room Information");
        patientDetailButton = new JButton("Patient Detail");
        patientUpdateDeleteButton = new JButton("Patient Update/Delete");
        patientAdmitInfoButton = new JButton("Patient Admit Information");
        servicesInfoButton = new JButton("Services Information");

       
        JPanel panel = new JPanel(new GridLayout(6, 1));
        panel.add(doctorDetailsButton);
        panel.add(roomInformationButton);
        panel.add(patientDetailButton);
        panel.add(patientUpdateDeleteButton);
        panel.add(patientAdmitInfoButton);
        panel.add(servicesInfoButton);

        
        getContentPane().add(panel);

       
        doctorDetailsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                DoctorDetailsForm dt = new DoctorDetailsForm();
            }
        });

        roomInformationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                RoomInformationForm ri = new  RoomInformationForm();
            }
        });

        patientDetailButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                PatientDetailsForm pd = new PatientDetailsForm();
            }
        });

        patientUpdateDeleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
            }
        });

        patientAdmitInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        servicesInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ServicesInformationForm Si = new ServicesInformationForm();
            }
        });

       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
