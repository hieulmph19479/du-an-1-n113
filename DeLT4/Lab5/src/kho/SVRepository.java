package kho;

import java.sql.Connection;
import jdbc.jdbcUtil;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import model.sinhVien;

public class SVRepository {

    public void insert(sinhVien sv) {
        try {
            Connection conn = jdbcUtil.getConnection();

            String query = "INSERT INTO sinhVien "
                    + "(hoTen, email, sdt, gioiTinh, diaChi)"
                    + " VALUES (?,?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, sv.getHoTen());
            ps.setString(2, sv.getEmail());
            ps.setInt(3, sv.getGioiTinh());
            ps.setString(4, sv.getSdt());
            ps.setString(5, sv.getSdt());

            ps.execute();
            System.out.println(" inser ok");
        } catch (Exception e) {
        }

    }

    public void update(int masv, sinhVien sv) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String query = "UPDATE sinhVien "
                    + " SET hoTen = ?, email ?, sdt = ?, gioiTinh =?,"
                    + " diaCh = ?  WHERE masv = ?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, sv.getHoTen());
            ps.setString(2, sv.getEmail());
            ps.setInt(3, sv.getGioiTinh());
            ps.setString(4, sv.getSdt());
            ps.setString(5, sv.getSdt());
            ps.setInt(6, sv.getMasv());

            ps.execute();
            System.out.println(" UPdate ok");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int masv) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String query = "DELETE FROM sinhVien  WHERE masv = ?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, masv);
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<sinhVien> all() {
        ArrayList<sinhVien> listSV = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.getConnection();
            String query = " SELECT * FROM sinhVien";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                int masv = rs.getInt("masv");
                String hoTen = rs.getString("hoTen");
                String email = rs.getString("email");
                String sdt = rs.getString("sdt");
                int gioiTinh = rs.getInt("gioiTinh");
                String diaChi = rs.getString("diaChi");

                sinhVien sv = new sinhVien(masv, hoTen, email, sdt, gioiTinh, diaChi);
                listSV.add(sv);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listSV;
    }

}
