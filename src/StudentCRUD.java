package src;

import java.sql.*;
import java.util.Scanner;

public class StudentCRUD {

    static final String JDBC_URL = "jdbc:mysql://localhost:3306/student";
    static final String JDBC_USER = "admin"; // change as needed
    static final String JDBC_PASSWORD = "Abc@2025"; // change as needed

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            System.out.println("Connected to the database.");

            while (true) {
                System.out.println("\n---- MENU ----");
                System.out.println("1. Create Student");
                System.out.println("2. Read All Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        System.out.print("Enter roll no: ");
                        String rollno = scanner.nextLine();
                        createStudent(conn, name, age, rollno);
                        break;
                    case 2:
                        readStudents(conn);
                        break;
                    case 3:
                        System.out.print("Enter roll no to update: ");
                        String rollToUpdate = scanner.nextLine();
                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter new age: ");
                        int newAge = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        updateStudent(conn, rollToUpdate, newName, newAge);
                        break;
                    case 4:
                        System.out.print("Enter roll no to delete: ");
                        String rollToDelete = scanner.nextLine();
                        deleteStudent(conn, rollToDelete);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void createStudent(Connection conn, String name, int age, String rollno) throws SQLException {
        String sql = "INSERT INTO studentinfo (name, age, roolno) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, rollno);
            stmt.executeUpdate();
            System.out.println("Student added.");
        }
    }

    static void readStudents(Connection conn) throws SQLException {
        String sql = "SELECT * FROM studentinfo";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("\n-- Student List --");
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("name") +
                        ", Age: " + rs.getInt("age") +
                        ", Roll No: " + rs.getString("roolno"));
            }
        }
    }

    static void updateStudent(Connection conn, String rollno, String newName, int newAge) throws SQLException {
        String sql = "UPDATE studentinfo SET name = ?, age = ? WHERE roolno = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, newName);
            stmt.setInt(2, newAge);
            stmt.setString(3, rollno);
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Student updated.");
            } else {
                System.out.println("Student not found.");
            }
        }
    }

    static void deleteStudent(Connection conn, String rollno) throws SQLException {
        String sql = "DELETE FROM studentinfo WHERE roolno = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, rollno);
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Student deleted.");
            } else {
                System.out.println("Student not found.");
            }
        }
    }
}
/*
Connected to the database.

---- MENU ----
1. Create Student
2. Read All Students
3. Update Student
4. Delete Student
5. Exit
Choose an option: 1
Enter name: saki
Enter age: 23
Enter roll no: 23e1154765
Student added.

---- MENU ----
1. Create Student
2. Read All Students
3. Update Student
4. Delete Student
5. Exit
Choose an option: 2

-- Student List --
Name: ram, Age: 25, Roll No: 24e1154221
Name: raj, Age: 25, Roll No: 24e1154222
Name: raj, Age: 25, Roll No: 24e1154222
Name: saki, Age: 23, Roll No: 23e1154765

---- MENU ----
1. Create Student
2. Read All Students
3. Update Student
4. Delete Student
5. Exit
Choose an option: 3
Enter roll no to update: 24e1154222
Enter new name: raju
Enter new age: 25
Student updated.

---- MENU ----
1. Create Student
2. Read All Students
3. Update Student
4. Delete Student
5. Exit
Choose an option: 2

-- Student List --
Name: ram, Age: 25, Roll No: 24e1154221
Name: raju, Age: 25, Roll No: 24e1154222
Name: raju, Age: 25, Roll No: 24e1154222
Name: saki, Age: 23, Roll No: 23e1154765

---- MENU ----
1. Create Student
2. Read All Students
3. Update Student
4. Delete Student
5. Exit
Choose an option: 4
Enter roll no to delete: 24e1154222
Student deleted.

---- MENU ----
1. Create Student
2. Read All Students
3. Update Student
4. Delete Student
5. Exit
Choose an option: 5
Exiting...

 */
