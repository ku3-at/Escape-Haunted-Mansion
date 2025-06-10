
package game.database;

import java.sql.*;

public class LoginManager {
    private static final String DB_URL = "jdbc:sqlite:users.db";

    public static void login(String username, String password) {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            String query = "SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Invalid credentials.");
            }

        } catch (SQLException e) {
            System.out.println("Login error: " + e.getMessage());
        }
    }

    public static void register(String username, String password) {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            String check = "SELECT * FROM users WHERE username=?";
            PreparedStatement checkStmt = conn.prepareStatement(check);
            checkStmt.setString(1, username);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next()) {
                System.out.println("Username already exists.");
                return;
            }

            String insert = "INSERT INTO users (username, password) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insert);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.executeUpdate();
            System.out.println("User registered successfully.");

        } catch (SQLException e) {
            System.out.println("Registration error: " + e.getMessage());
        }
    }
}
