package org.example;
import java.sql.*;

public class TaskManager {

    public void manageTasks() {

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
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS TaskDB");
            stmt.executeUpdate("USE TaskDB");

            // 2. Create Table
            String createTable = "CREATE TABLE IF NOT EXISTS tasks (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "title VARCHAR(100), " +
                    "status VARCHAR(20))";
            stmt.executeUpdate(createTable);

            // 3. Insert Tasks
            String insertData = "INSERT INTO tasks(title, status) VALUES " +
                    "('Complete Java Assignment', 'Pending')," +
                    "('Buy copy', 'Pending')," +
                    "('Go for running', 'Completed')," +
                    "('Drink Water', 'Completed')";
            stmt.executeUpdate(insertData);

            System.out.println("Database, Table created & Tasks inserted!");

            // 4. Read (Pending Tasks)
            String selectQuery = "SELECT * FROM tasks WHERE status = 'Pending'";
            ResultSet rs = stmt.executeQuery(selectQuery);

            System.out.println("\n--- Pending Tasks ---");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("title") + " " +
                                rs.getString("status"));
            }

            // 5. Update (Mark task ID = 1 as Completed)
            String updateQuery = "UPDATE tasks SET status = 'Completed' WHERE id = 1";
            stmt.executeUpdate(updateQuery);
            System.out.println("\nTask ID 1 marked as Completed");

            // 6. Delete (Remove Completed Tasks)
            String deleteQuery = "DELETE FROM tasks WHERE status = 'Completed'";
            int deleted = stmt.executeUpdate(deleteQuery);
            System.out.println("\nDeleted completed tasks: " + deleted);

            // Final Data
            ResultSet finalRs = stmt.executeQuery("SELECT * FROM tasks");

            System.out.println("\n--- Final Task Table ---");
            while (finalRs.next()) {
                System.out.println(
                        finalRs.getInt("id") + " " +
                                finalRs.getString("title") + " " +
                                finalRs.getString("status"));
            }

            // Close
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TaskManager obj = new TaskManager();
        obj.manageTasks();
    }
}
