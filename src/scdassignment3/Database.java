/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scdassignment3;

/**
 *
 * @author Muhammad Shahmeer
 */
import java.sql.Connection;
import java.sql.*;

public class Database {
    // JDBC connection parameters
    private static final String DB_URL = "jdbc:mysql://localhost/hospital";
    private static final String USER = "username";
    private static final String PASSWORD = "password";

    public  Database(String[] args) {
        try {
            
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            
            Doctor doctor1 = new Doctor(1, "Dr. Smith", "Cardiology");
            insertDoctor(conn, doctor1);

            
            Patient patient1 = new Patient(1, "John Doe", 30, "123 Main St");
            insertPatient(conn, patient1);
            
            Service service1 = new Service(1, "X-ray");
            insertService(conn, service1);

            // Create a room
            Room room1 = new Room(1, "101", 4);
            insertRoom(conn, room1);

            // Close the connection
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to insert a doctor into the database
    private static void insertDoctor(Connection conn, Doctor doctor) throws SQLException {
        String query = "INSERT INTO doctors (id, name, specialization) VALUES (?, ?, ?)";

        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setInt(1, doctor.getId());
            statement.setString(2, doctor.getName());
            statement.setString(3, doctor.getSpecialization());

            statement.executeUpdate();
        }
    }

    
    private static void insertPatient(Connection conn, Patient patient) throws SQLException {
        String query = "INSERT INTO patients (id, name, age, address) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setInt(1, patient.getId());
            statement.setString(2, patient.getName());
            statement.setInt(3, patient.getAge());
            statement.setString(4, patient.getAddress());

            statement.executeUpdate();
        }
    }

    
    private static void insertService(Connection conn, Service service) throws SQLException {
        String query = "INSERT INTO services (id, name) VALUES (?, ?)";

        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setInt(1, service.getId());
            statement.setString(2, service.getName());

            statement.executeUpdate();
        }
    }

    
    private static void insertRoom(Connection conn, Room room) throws SQLException {
        String query = "INSERT INTO rooms (id, name, capacity) VALUES (?, ?, ?)";

        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setInt(1, room.getId());
            statement.setString(2, room.getName());
            statement.setInt(3, room.getCapacity());

            statement.executeUpdate();
        }
    }

    Database() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
