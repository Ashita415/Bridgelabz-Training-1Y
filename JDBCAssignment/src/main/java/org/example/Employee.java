package org.example;
import java.sql.*;

public class Employee {

    public void manageEmployee() {

        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "root";

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            // 1. Create Database
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS CompanyDB");
            stmt.executeUpdate("USE CompanyDB");

            // 2. Create Table
            String createTable = "CREATE TABLE IF NOT EXISTS employee (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "name VARCHAR(50), " +
                    "salary DOUBLE)";
            stmt.executeUpdate(createTable);

            // 3. Insert Data
            String insertData = "INSERT INTO employee(name, salary) VALUES " +
                    "('Ashita', 35000)," +
                    "('Khushi', 28000)," +
                    "('Akshara', 42000)," +
                    "('Ashi', 15000)," +
                    "('Anjali', 12000)";

            stmt.executeUpdate(insertData);

            System.out.println("Database, Table created & Data inserted!");

            // 4. Read (salary > 30000)
            String selectQuery = "SELECT * FROM employee WHERE salary > 30000";
            ResultSet rs = stmt.executeQuery(selectQuery);

            System.out.println("\n--- Employees with Salary > 30000 ---");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getDouble("salary"));
            }

            // 5. Update (Increase salary by 10% for ID = 1)
            String updateQuery = "UPDATE employee SET salary = salary * 1.10 WHERE id = 1";
            stmt.executeUpdate(updateQuery);
            System.out.println("\nSalary updated for employee ID 1");

            // 6. Delete (salary < 15000)
            String deleteQuery = "DELETE FROM employee WHERE salary < 15000";
            int deleted = stmt.executeUpdate(deleteQuery);
            System.out.println("\nDeleted employees with salary < 15000: " + deleted);

            // Final Data
            ResultSet finalRs = stmt.executeQuery("SELECT * FROM employee");

            System.out.println("\n--- Final Employee Table ---");
            while (finalRs.next()) {
                System.out.println(
                        finalRs.getInt("id") + " " +
                                finalRs.getString("name") + " " +
                                finalRs.getDouble("salary"));
            }

            // Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.manageEmployee();
    }
}