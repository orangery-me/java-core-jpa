package test;
import java.sql.Connection;
import java.sql.Statement;

import database.JDBCUtil;

public class TestJDBCUtil{
    public static void main(String[] args) {

        try {
            // B1: tạo kết nối
            Connection c = JDBCUtil.getConnection();
            
            //B2: Tạo đối tượng Statement
            Statement statement = c.createStatement();

            //B3: Thực thi câu lệnh
            String sql= "INSERT INTO THISINH VALUES(105,\"CHAU THI\", \"2004-12-08\", \"QUANG NAM\", \"2022\", \"1\");";
            int check= statement.executeUpdate(sql);

            //B4: Xu ly KQ
            if (check>0)
            System.out.println("Da thay doi: "+check+" dong");
            else System.out.println("Khong thanh cong");

            // B5: Ngắt kết nối
            JDBCUtil.disruptConnection(c);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}