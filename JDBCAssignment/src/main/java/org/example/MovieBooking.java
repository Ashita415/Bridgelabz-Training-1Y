package org.example;
import java.sql.*;

public class MovieBooking {

    public void manageMovies() {

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
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS MovieDB");
            stmt.executeUpdate("USE MovieDB");

            // 2. Create Table
            String createTable = "CREATE TABLE IF NOT EXISTS movies (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "name VARCHAR(50), " +
                    "seats INT)";
            stmt.executeUpdate(createTable);


            // 3. Insert Movies
            String insertData = "INSERT INTO movies(name, seats) VALUES " +
                    "('Me And Thee', 50)," +
                    "('Wu', 0)," +
                    "('You Maniac', 30)," +
                    "('Perfect Crown', 10)";
            stmt.executeUpdate(insertData);

            System.out.println("Database, Table created & Movies inserted!");

            // 4. Read
            String selectQuery = "SELECT * FROM movies WHERE seats > 0";
            ResultSet rs = stmt.executeQuery(selectQuery);

            System.out.println("\n--- Movies with Available Seats ---");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getInt("seats"));
            }

            // 5. Update
            String updateQuery = "UPDATE movies SET seats = seats - 1 WHERE id = 1 AND seats > 0";
            stmt.executeUpdate(updateQuery);
            System.out.println("\n1 seat booked for movie ID 1");

            // 6. Delete
            String deleteQuery = "DELETE FROM movies WHERE id = 2";
            int deleted = stmt.executeUpdate(deleteQuery);
            System.out.println("\nDeleted movies: " + deleted);

            // Final Data
            ResultSet finalRs = stmt.executeQuery("SELECT * FROM movies");

            System.out.println("\n--- Final Movie Table ---");
            while (finalRs.next()) {
                System.out.println(
                        finalRs.getInt("id") + " " +
                                finalRs.getString("name") + " " +
                                finalRs.getInt("seats"));
            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MovieBooking obj = new MovieBooking();
        obj.manageMovies();
    }
}
