/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import dorm.system.of.kyle.DBConnection;
import java.sql.*;
/**
 *
 * @author admin
 */


public class VisitorDAO {

    // Find by full name + contact (simple + practical)
    public Integer findVisitorId(String fullName, String contactNo) throws SQLException {
        String sql = "SELECT visitor_id FROM visitors WHERE full_name = ? AND (contact_no = ? OR ? = '') LIMIT 1";

        try (Connection conn = new DBConnection().getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, fullName);
            ps.setString(2, contactNo);
            ps.setString(3, contactNo);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) return rs.getInt("visitor_id");
            }
        }
        return null;
    }

    // Insert visitor (returns generated ID)
    public int insertVisitor(String visitorType, String fullName, String sex, String contactNo, String address) throws SQLException {
        String sql = "INSERT INTO visitors (visitor_type, full_name, sex, contact_no, address) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = new DBConnection().getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, visitorType);      // 'STUDENT' or 'NON_STUDENT'
            ps.setString(2, fullName);
            ps.setString(3, sex);
            ps.setString(4, contactNo.isEmpty() ? null : contactNo);
            ps.setString(5, address.isEmpty() ? null : address);

            ps.executeUpdate();

            try (ResultSet keys = ps.getGeneratedKeys()) {
                if (keys.next()) return keys.getInt(1);
            }
        }
        throw new SQLException("Failed to insert visitor. No ID returned.");
    }
}
