package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentCRUDSwing extends JFrame {

    static final String JDBC_URL = "jdbc:mysql://localhost:3306/student";
    static final String JDBC_USER = "admin";
    static final String JDBC_PASSWORD = "Abc@2025";

    private Connection conn;

    private JTextField nameField, ageField, rollnoField;
    private JTextArea outputArea;

    public StudentCRUDSwing() {
        setTitle("Student CRUD - Swing UI");
        setSize(500, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Initialize DB Connection
        try {
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            JOptionPane.showMessageDialog(this, "Connected to the database!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database connection failed!");
            e.printStackTrace();
            System.exit(1);
        }

        // Input Panel
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Student Information"));

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Age:"));
        ageField = new JTextField();
        inputPanel.add(ageField);

        inputPanel.add(new JLabel("Roll No:"));
        rollnoField = new JTextField();
        inputPanel.add(rollnoField);

        // Button Panel (separate)
        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 10, 10));
        JButton createButton = new JButton("Create");
        JButton readButton = new JButton("Read");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");

        buttonPanel.add(createButton);
        buttonPanel.add(readButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);

        // Output Area
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Output"));

        // Add panels to frame
        JPanel topPanel = new JPanel(new BorderLayout(10, 10));
        topPanel.add(inputPanel, BorderLayout.NORTH);
        topPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Button Actions
        createButton.addActionListener(e -> createStudent());
        readButton.addActionListener(e -> readStudents());
        updateButton.addActionListener(e -> updateStudent());
        deleteButton.addActionListener(e -> deleteStudent());
    }

    private void createStudent() {
        String name = nameField.getText();
        String ageText = ageField.getText();
        String rollno = rollnoField.getText();

        if (name.isEmpty() || ageText.isEmpty() || rollno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.");
            return;
        }

        try {
            int age = Integer.parseInt(ageText);

            String sql = "INSERT INTO studentinfo (name, age, roolno) VALUES (?, ?, ?)";

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, name);
                stmt.setInt(2, age);
                stmt.setString(3, rollno);
                stmt.executeUpdate();
                outputArea.append("Student added: " + name + "\n");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Age must be a number.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            outputArea.append("Error adding student.\n");
        }
    }

    private void readStudents() {
        String sql = "SELECT * FROM studentinfo";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            outputArea.setText(""); // Clear previous output
            outputArea.append("-- Student List --\n");

            while (rs.next()) {
                outputArea.append("Name: " + rs.getString("name") +
                        ", Age: " + rs.getInt("age") +
                        ", Roll No: " + rs.getString("roolno") + "\n");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            outputArea.append("Error reading students.\n");
        }
    }

    private void updateStudent() {
        String rollno = rollnoField.getText();
        String newName = nameField.getText();
        String newAgeText = ageField.getText();

        if (rollno.isEmpty() || newName.isEmpty() || newAgeText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.");
            return;
        }

        try {
            int newAge = Integer.parseInt(newAgeText);

            String sql = "UPDATE studentinfo SET name = ?, age = ? WHERE roolno = ?";

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, newName);
                stmt.setInt(2, newAge);
                stmt.setString(3, rollno);
                int rows = stmt.executeUpdate();
                if (rows > 0) {
                    outputArea.append("Student updated: " + rollno + "\n");
                } else {
                    outputArea.append("Student not found: " + rollno + "\n");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Age must be a number.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            outputArea.append("Error updating student.\n");
        }
    }

    private void deleteStudent() {
        String rollno = rollnoField.getText();

        if (rollno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Roll No to delete.");
            return;
        }

        String sql = "DELETE FROM studentinfo WHERE roolno = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, rollno);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                outputArea.append("Student deleted: " + rollno + "\n");
            } else {
                outputArea.append("Student not found: " + rollno + "\n");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            outputArea.append("Error deleting student.\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StudentCRUDSwing().setVisible(true);
        });
    }
}
