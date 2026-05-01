package org.example;
import java.sql.*;

public class Enrollment{

    public void manageEnrollments() {

        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "root";

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            // 1. Create Database
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS CourseDB");
            stmt.executeUpdate("USE CourseDB");

            // 2. Create Table
            String createTable = "CREATE TABLE IF NOT EXISTS enrollments (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "student VARCHAR(50), " +
                    "course VARCHAR(50))";
            stmt.executeUpdate(createTable);

            // (Optional) Clear old data to avoid duplicates
            stmt.executeUpdate("DELETE FROM enrollments");

            // 3. Insert Enrollments
            String insertData = "INSERT INTO enrollments(student, course) VALUES " +
                    "('Ashita', 'Java')," +
                    "('Akshara', 'Python')," +
                    "('Pip', 'Java')," +
                    "('Leo', 'C++')," +
                    "('Khushi', 'Python')";
            stmt.executeUpdate(insertData);

            System.out.println("Database, Table created & Data inserted!");

            // 4. Read (Enrollments for specific course: Java)
            String selectQuery = "SELECT * FROM enrollments WHERE course = 'Java'";
            ResultSet rs = stmt.executeQuery(selectQuery);

            System.out.println("\n--- Students enrolled in Java ---");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("student") + " " +
                                rs.getString("course"));
            }

            // 5. Update (Change course of student ID = 2 to Java)
            String updateQuery = "UPDATE enrollments SET course = 'Java' WHERE id = 2";
            stmt.executeUpdate(updateQuery);
            System.out.println("\nUpdated course for student ID 2");

            // 6. Delete (Remove enrollment of ID = 4)
            String deleteQuery = "DELETE FROM enrollments WHERE id = 4";
            int deleted = stmt.executeUpdate(deleteQuery);
            System.out.println("\nDeleted enrollment count: " + deleted);

            // Final Data
            ResultSet finalRs = stmt.executeQuery("SELECT * FROM enrollments");

            System.out.println("\n--- Final Enrollment Table ---");
            while (finalRs.next()) {
                System.out.println(
                        finalRs.getInt("id") + " " +
                                finalRs.getString("student") + " " +
                                finalRs.getString("course"));
            }

            // Close
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Enrollment obj = new Enrollment();
        obj.manageEnrollments();
    }
}