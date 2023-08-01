package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.KhachHang;

public class KHDAO implements DAO<KhachHang,Integer> {

    @Override
    public int add(KhachHang t) {
        try {
            // b1:
            Connection c = JDBCUtil.getConnection();
            // b2: Tạo đối tượng statement
            Statement st = c.createStatement();
            // b3:
            String query = "INSERT INTO KHACHHANG VALUES('" + t.getIdKH() + "', '" + t.getHoTen() + "','"
                    + t.getNgaySinh() + "','" + t.getSDT() + ");";
            System.out.println(query);
            int check = st.executeUpdate(query);

            System.out.println(check + " dong da thay doi");
            JDBCUtil.disruptConnection(c);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(KhachHang t) {
        try {
            // b1:
            Connection c = JDBCUtil.getConnection();
            // b2: Tạo đối tượng statement
            Statement st = c.createStatement();
            // b3:
            String query = "UPDATE KHACHHANG SET SDT=" + t.getSDT() + " WHERE ID='" + t.getIdKH() + "';";
            System.out.println(query);
            int check = st.executeUpdate(query);

            System.out.println(check + " dong da thay doi");
            JDBCUtil.disruptConnection(c);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int delete(KhachHang t) {
        try {
            // b1:
            Connection c = JDBCUtil.getConnection();
            // b2: Tạo đối tượng statement
            Statement st = c.createStatement();
            // b3:
            String query = "DELETE FROM KHACHHANG WHERE ID=" + t.getIdKH() + ";";
            System.out.println(query);
            int check = st.executeUpdate(query);

            System.out.println(check + " dong da thay doi");
            JDBCUtil.disruptConnection(c);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public ArrayList<KhachHang> selectAll() {
        ArrayList<KhachHang> khList = new ArrayList<KhachHang>();
        try {
            // b1:
            Connection c = JDBCUtil.getConnection();
            // b2: Tạo đối tượng statement
            Statement st = c.createStatement();
            // b3:
            String query = "SELECT * FROM KHACHHANG;";
            System.out.println(query);
            ResultSet result = st.executeQuery(query);
            while (result.next()) {
                Integer idkh = (Integer) result.getObject("IDKH");
                String hoTen = (String) result.getObject("HOTEN");
                Date ngaySinh = (Date) result.getObject("NGAYSINH");
                String SDT = (String) result.getObject("SDT");
                KhachHang kh = new KhachHang(idkh, hoTen, ngaySinh, SDT);
                khList.add(kh);
            }

            JDBCUtil.disruptConnection(c);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return khList;
    }

    @Override
    public KhachHang selectByID(Integer IDKH) {
        KhachHang kh = null;
        try {
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();

            String query = "SELECT * FROM KHACHHANG WHERE IDKH='" + IDKH + "';";
            System.out.println(query);
            ResultSet result = st.executeQuery(query);

            while (result.next()) {
                Integer idkh = (Integer) result.getObject("IDKH");
                String hoTen = (String) result.getObject("HOTEN");
                Date ngaySinh = (Date) result.getObject("NGAYSINH");
                String SDT = (String) result.getObject("SDT");
                kh = new KhachHang(idkh, hoTen, ngaySinh, SDT);
            }

            JDBCUtil.disruptConnection(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kh;
    }

    @Override
    public ArrayList<KhachHang> selectByCondition(String condition) {
        ArrayList<KhachHang> khList = new ArrayList<KhachHang>();
        try {
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();

            String query = condition;
            ResultSet result = st.executeQuery(query);
            while (result.next()) {
                Integer idkh = (Integer) result.getObject("IDKH");
                String hoTen = (String) result.getObject("HOTEN");
                Date ngaySinh = (Date) result.getObject("NGAYSINH");
                String SDT = (String) result.getObject("SDT");
                KhachHang kh = new KhachHang(idkh, hoTen, ngaySinh, SDT);
                khList.add(kh);
            }

            JDBCUtil.disruptConnection(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return khList;
    }

}
