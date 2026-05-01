package org.example;
import java.sql.*;

public class Bookstore {

    public void manageSales() {

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
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS BookStoreDB");
            stmt.executeUpdate("USE BookStoreDB");

            // 2. Create Table
            String createTable = "CREATE TABLE IF NOT EXISTS sales (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "bookName VARCHAR(100), " +
                    "quantity INT, " +
                    "price DOUBLE)";
            stmt.executeUpdate(createTable);

            // (Optional) Clear old data
            stmt.executeUpdate("DELETE FROM sales");

            // 3. Insert Sales
            String insertData = "INSERT INTO sales(bookName, quantity, price) VALUES " +
                    "('The Silent Patient', 1, 500)," +
                    "('Never Lie', 2, 700)," +
                    "('Gone Girl', 1, 650)," +
                    "('One Of Us Is Lying', 1, 455)";
            stmt.executeUpdate(insertData);

            System.out.println("Database, Table created & Sales inserted!");

            // 4. Read (quantity > 1)
            String selectQuery = "SELECT * FROM sales WHERE quantity > 1";
            ResultSet rs = stmt.executeQuery(selectQuery);

            System.out.println("\n--- Sales with Quantity > 1 ---");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("bookName") + " " +
                                rs.getInt("quantity") + " " +
                                rs.getDouble("price"));
            }

            // 5. Update (Modify quantity for ID = 2)
            String updateQuery = "UPDATE sales SET quantity = 5 WHERE id = 2";
            stmt.executeUpdate(updateQuery);
            System.out.println("\nUpdated quantity for sale ID 2");

            // 6. Delete (Remove incorrect entry ID = 4)
            String deleteQuery = "DELETE FROM sales WHERE id = 4";
            int deleted = stmt.executeUpdate(deleteQuery);
            System.out.println("\nDeleted entries: " + deleted);

            // Final Data
            ResultSet finalRs = stmt.executeQuery("SELECT * FROM sales");

            System.out.println("\n--- Final Sales Table ---");
            while (finalRs.next()) {
                System.out.println(
                        finalRs.getInt("id") + " " +
                                finalRs.getString("bookName") + " " +
                                finalRs.getInt("quantity") + " " +
                                finalRs.getDouble("price"));
            }

            // Close
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Bookstore obj = new Bookstore();
        obj.manageSales();
    }
}
