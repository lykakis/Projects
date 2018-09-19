package gr.likakis.customermanagment.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseAction {

    public static Connection connect() {
        String url = "jdbc:sqlite:customers.sqlite3";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void insert(customer customerToInsert) {
        String sql = "INSERT INTO customers(name,lastName,address,phone,email,profession) VALUES(?,?,?,?,?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, customerToInsert.getName());
            pstmt.setString(2, customerToInsert.getLastName());
            pstmt.setString(3, customerToInsert.getAddress());
            pstmt.setString(4, customerToInsert.getPhone());
            pstmt.setString(5, customerToInsert.getEmail());
            pstmt.setString(6, customerToInsert.getProfession());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<String> selectAll() {
        String sql = "SELECT * FROM customers";
        ArrayList<String> values = new ArrayList<String>();
        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                values.add(rs.getString("name") + "/"
                        + rs.getString("lastName") + "/"
                        + rs.getString("address") + "/"
                        + rs.getString("phone") + "/"
                        + rs.getString("email") + "/"
                        + rs.getString("profession") + "/"
                        + rs.getString("id")
                );

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return values;
    }

    public ArrayList<String> search(int searchBy, String searchFor) {
        ArrayList<String> values = new ArrayList<String>();
        String sql;
        switch (searchBy) {
            case 0:
                sql = "SELECT * FROM customers WHERE name='" + searchFor + "'";
                break;
            case 1:
                sql = "SELECT * FROM customers WHERE lastName='" + searchFor + "'";
                break;
            case 2:
                sql = "SELECT * FROM customers WHERE address='" + searchFor + "'";
                break;
            case 3:
                sql = "SELECT * FROM customers WHERE phone='" + searchFor + "'";
                break;
            case 4:
                sql = "SELECT * FROM customers WHERE email='" + searchFor + "'";
                break;
            case 5:
                sql = "SELECT * FROM customers WHERE profession='" + searchFor + "'";
                break;
            default:
                sql = "SELECT * FROM customers";
                break;
        }
        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                values.add(rs.getString("name") + "/"
                        + rs.getString("lastName") + "/"
                        + rs.getString("address") + "/"
                        + rs.getString("phone") + "/"
                        + rs.getString("email") + "/"
                        + rs.getString("profession") + "/"
                        + rs.getString("id")
                );

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return values;
    }

    public void saveChanges(String[] dataTosave, int id) {
        String sql = "UPDATE  customers SET "
                + "name = ? , "
                + "lastName = ? , "
                + "address = ?,"
                + "phone = ?,"
                + "email = ?,"
                + "profession = ?"
                + "WHERE id=" + id;

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, dataTosave[0]);
            pstmt.setString(2, dataTosave[1]);
            pstmt.setString(3, dataTosave[2]);
            pstmt.setString(4, dataTosave[3]);
            pstmt.setString(5, dataTosave[4]);
            pstmt.setString(6, dataTosave[5]);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

         
    }
    
    public void deleteCustomer(customer current){
        String sql = "DELETE FROM customers WHERE id=?";
        try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, current.getId());
            pstmt.executeUpdate();
          
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
