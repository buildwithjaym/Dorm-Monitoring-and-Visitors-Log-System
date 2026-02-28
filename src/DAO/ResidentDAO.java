package DAO;

import Operator.ResidentItem;
import dorm.system.of.kyle.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResidentDAO {

    public List<ResidentItem> getActiveResidents() throws SQLException {
        List<ResidentItem> list = new ArrayList<>();

        String sql = "SELECT resident_id, full_name, room_no " +
                     "FROM residents " +
                     "WHERE status = 'ACTIVE' " +
                     "ORDER BY full_name ASC";

        try (Connection conn = new DBConnection().getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("resident_id");
                String name = rs.getString("full_name");
                String room = rs.getString("room_no");

                list.add(new ResidentItem(id, name, room));
            }
        }

        return list;
    }
}