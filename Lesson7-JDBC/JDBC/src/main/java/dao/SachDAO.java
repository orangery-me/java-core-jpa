package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Sach;

public class SachDAO implements DAO<Sach,Integer>{

    @Override
    public int add(Sach t) {
        try {
                //b1:
                Connection c= JDBCUtil.getConnection();
                //b2: Tạo đối tượng statement
                Statement st= c.createStatement();
                //b3:
                String query= "INSERT INTO SACH VALUES('"+t.getId()+"', '"+t.getTenSach()+"','"+t.getTacGia()+"','"+t.getNamXB()+"',"+t.getGiaBan()+");";
                System.out.println(query);
                int check = st.executeUpdate(query);

                System.out.println(check+" dong da thay doi");
                JDBCUtil.disruptConnection(c);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Sach t) {
        try {
                //b1:
                Connection c= JDBCUtil.getConnection();
                //b2: Tạo đối tượng statement
                Statement st= c.createStatement();
                //b3:
                String query= "UPDATE SACH SET GIABAN="+t.getGiaBan()+" WHERE ID='"+t.getId()+"';";
                System.out.println(query);
                int check = st.executeUpdate(query);

                System.out.println(check+" dong da thay doi");
                JDBCUtil.disruptConnection(c);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int delete(Sach t) {
        try {
                //b1:
                Connection c= JDBCUtil.getConnection();
                //b2: Tạo đối tượng statement
                Statement st= c.createStatement();
                //b3:
                String query= "DELETE FROM SACH WHERE ID="+t.getId()+";";
                System.out.println(query);
                int check = st.executeUpdate(query);

                System.out.println(check+" dong da thay doi");
                JDBCUtil.disruptConnection(c);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public ArrayList<Sach> selectAll() {
        ArrayList<Sach> sachList= new ArrayList<Sach>();
        try {
                //b1:
                Connection c= JDBCUtil.getConnection();
                //b2: Tạo đối tượng statement
                Statement st= c.createStatement();
                //b3:
                String query= "SELECT * FROM SACH;";
                System.out.println(query);
                ResultSet result = st.executeQuery(query);
                while (result.next()){
                    String id= (String)result.getObject("ID");
                    String tenSach= (String)result.getObject("TENSACH");
                    String tacGia= (String)result.getObject("TACGIA");
                    Date namXB= (Date)result.getObject("NAMXB");
                    int giaBan= (Integer)result.getObject("GIABAN");
                    Sach sach= new Sach(id, tenSach, tacGia, namXB, giaBan);
                    sachList.add(sach);
                }

                JDBCUtil.disruptConnection(c);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return sachList;
    }

    @Override
    public Sach selectByID(Integer ID) {
        Sach sach = null; 
       try {
        Connection c= JDBCUtil.getConnection();
        Statement st= c.createStatement();

        String query= "SELECT * FROM SACH WHERE ID='"+ID+"';";
        System.out.println(query);
        ResultSet result= st.executeQuery(query);

        while (result.next()){
            String id= (String)result.getObject("ID");
            String tenSach= (String)result.getObject("TENSACH");
            String tacGia= (String)result.getObject("TACGIA");
            Date namXB= (Date)result.getObject("NAMXB");
            int giaBan= (Integer)result.getObject("GIABAN");
            sach = new Sach(id, tenSach, tacGia, namXB, giaBan);
        }

        JDBCUtil.disruptConnection(c);
       } catch (Exception e) {
        e.printStackTrace();
       }
       return sach;
    }

    @Override
    public ArrayList<Sach> selectByCondition(String condition) {
        ArrayList <Sach> sachList= new ArrayList<Sach>();
        try {
            Connection c= JDBCUtil.getConnection();
            Statement st= c.createStatement();

            String query=condition;
            ResultSet result= st.executeQuery(query);
            while (result.next()){
                    String id= (String)result.getObject("ID");
                    String tenSach= (String)result.getObject("TENSACH");
                    String tacGia= (String)result.getObject("TACGIA");
                    Date namXB= (Date)result.getObject("NAMXB");
                    int giaBan= (Integer)result.getObject("GIABAN");
                    Sach sach= new Sach(id, tenSach, tacGia, namXB, giaBan);
                    sachList.add(sach);
            }

            JDBCUtil.disruptConnection(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sachList;
    }
    
}
