package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class Student {
    public void insertEntries() {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "root";
        try {
// Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

// Connect to MySQL
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS Java");
            stmt.executeUpdate("USE Java");
//Create Table
            String createTable = "CREATE TABLE IF NOT EXISTS student (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "name VARCHAR(50), " +
                    "marks INT)";
            stmt.executeUpdate(createTable);
// Insert Data
            String insertData = "INSERT INTO student(name, marks) VALUES" +
                    "('Tanmay', 85)," +
                    "('Rahul', 90)," +
                    "('Ashita',67)," +
                    "('Khushi',34)";


            stmt.executeUpdate(insertData);
            System.out.println("Database, Table created & Data inserted!");
// SELECT DATA (Result Statement)
            String selectQuery = "SELECT * FROM student";
            ResultSet rs = stmt.executeQuery(selectQuery);

            System.out.println("\n---Student Table Data ---");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");
                System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
            }

// Close connection
            con.close();


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.insertEntries();
    }
}