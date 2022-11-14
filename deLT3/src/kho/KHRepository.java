
package kho;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import jdbc.jdbcUtil;
import java.sql.ResultSet;
import model.KhachHang;


public class KHRepository {
    public ArrayList<KhachHang> all(){
        ArrayList<KhachHang>listKH = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.getConnection();
            String query = "SELECT * FROM khach_hang";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while(rs.next() == true){
               int id = rs.getInt("id");
               String ten = rs.getString("ten");
               String diaChi = rs.getString("dia_chi");
               String emial = rs.getString("email");
               int tuoi = rs.getInt("tuoi");
               int gioiTinh = rs.getInt("gioi_tinh");
               
               KhachHang kh = new KhachHang(id, ten, diaChi, emial, tuoi, gioiTinh);
               listKH.add(kh);
                System.out.println("all ok");
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listKH;
    }
    public void insert(KhachHang kh){
        try {
            Connection conn = jdbcUtil.getConnection();
            String query = "INSERT INTO khach_hang "
                    + "(ten, dia_chi, email, tuoi, gioi_tinh) VALUES"
                    + " (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,kh.getTen());
            ps.setString(2, kh.getDiaChi());
            ps.setString(3, kh.getEmail());
            ps.setInt(4, kh.getTuoi());
            ps.setInt(5, kh.getGioiTinh());
            
            ps.execute();
            
            System.out.println("inser ok");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  void update(int id ,KhachHang kh){
        try {
            Connection conn = jdbcUtil.getConnection();
            String query = "UPDATE khach_hang "
                    + "SET ten =?,dia_chi = ?,email = ?,tuoi = ?, gioi_tinh = ? WHERE id = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,kh.getTen());
            ps.setString(2, kh.getDiaChi());
            ps.setString(3, kh.getEmail());
            ps.setInt(4, kh.getTuoi());
            ps.setInt(5, kh.getGioiTinh());
            ps.setInt(6, kh.getId());
            ps.execute();
            System.out.println("update ok");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete(int id){
        try {
            Connection conn = jdbcUtil.getConnection();
            String query = "DELETE FROM khach_hang WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.execute();
            System.out.println("delete ok");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
