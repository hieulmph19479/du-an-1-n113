package kho;

import java.util.ArrayList;
import java.sql.Connection;
import jdbc.jdbcUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.NhanVien;

public class NVRepository {

    public ArrayList<NhanVien> all() {
        ArrayList<NhanVien> listNV = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.getConnection();
            String query = "SELECT * FROM nhan_vien";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                String maNV = rs.getString("ma_nv");
                String sdt = rs.getString("sdt");
                int tuoi = rs.getInt("tuoi");
                int vaiTro = rs.getInt("vai_tro");

                NhanVien nv = new NhanVien(id, ten, maNV, sdt, tuoi, vaiTro);
                listNV.add(nv);
                System.out.println("Load all OK");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNV;
    }

    public void insert(NhanVien nv) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String query = "INSERT INTO nhan_vien"
                    + " (ten, ma_nv, sdt, tuoi, vai_tro) "
                    + " VALUES (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nv.getTen());
            ps.setString(2, nv.getTen());
            ps.setString(3, nv.getSdt());
            ps.setInt(4, nv.getTuoi());
            ps.setInt(5, nv.getVaiTro());
            ps.execute();

            System.out.println("Insert ok ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(int id, NhanVien nv) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String query = "UPDATE nhan_vien"
                    + " SET ten = ?, ma_nv = ?, sdt = ?, tuoi = ?, vai_tro = ? WHERE id = ?; ";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nv.getTen());
            ps.setString(2, nv.getTen());
            ps.setString(3, nv.getSdt());
            ps.setInt(4, nv.getTuoi());
            ps.setInt(5, nv.getVaiTro());
            ps.setInt(6, nv.getId());
            ps.execute();

            System.out.println("update ok ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String query = "DELETE FROM nhan_vien WHERE id = ?; ";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.execute();

            System.out.println("delete ok ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
