package repository;

import java.util.ArrayList;
import model.XeMay;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class XeMayRepository {

    public ArrayList<XeMay> getAll() {
        ArrayList<XeMay> listXeMay = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String q = "SELECT * FROM XeMay";
            PreparedStatement ps = conn.prepareStatement(q);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                String maS = rs.getString("Ma");
                String TenS = rs.getString("Ten");
                double GiaD = rs.getDouble("GiaBan");
                int soLuongI = rs.getInt("SoLuong");
                int trangThaiI = rs.getInt("TrangThai");
                XeMay XM = new XeMay(maS, TenS, GiaD, soLuongI, trangThaiI);
                listXeMay.add(XM);
            }

            System.out.println("All ok");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listXeMay;
    }

    public void update(String Ma, XeMay xe) {
        try {
            Connection conn = DBContext.getConnection();
            String q = "UPDATE XeMay "
                    + " SET Ten = ?, GiaBan =?,SoLuong =?,TrangThai =?  WHERE Ma =?";
            PreparedStatement ps = conn.prepareStatement(q);
            ps.setString(1, xe.getTen());
            ps.setDouble(2, xe.getGia());
            ps.setInt(3, xe.getSoLuong());
            ps.setInt(4, xe.getTrangThai());
            ps.setString(5, xe.getMa());
            ps.execute();
            System.out.println("update ok");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String Ma) {
        try {
            Connection conn = DBContext.getConnection();
            String q = "DELETE FROM XeMay WHERE Ma =?";
            PreparedStatement ps = conn.prepareStatement(q);
            ps.setString(1, Ma);
            ps.execute();
            System.out.println("Delete ok");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
