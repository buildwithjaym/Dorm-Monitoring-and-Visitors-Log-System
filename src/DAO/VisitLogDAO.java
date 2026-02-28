/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class VisitLogDAO {

    public void insertVisitLog(int visitorId, int hostResidentId, String relationship, String purpose,
                           int allowedMinutes, int checkedInBy, String remarks) throws SQLException {

    String sql = "INSERT INTO visit_logs " +
            "(visitor_id, host_resident_id, relationship, purpose, status, allowed_minutes, overstay_minutes, checked_in_by, remarks) " +
            "VALUES (?, ?, ?, ?, 'ACTIVE', ?, 0, ?, ?)";

    try (Connection conn = new dorm.system.of.kyle.DBConnection().getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setInt(1, visitorId);
        ps.setInt(2, hostResidentId);
        ps.setString(3, relationship);
        ps.setString(4, purpose);
        ps.setInt(5, allowedMinutes);
        ps.setInt(6, checkedInBy);
        ps.setString(7, (remarks == null || remarks.isEmpty()) ? null : remarks);

        ps.executeUpdate();
    }
}
}