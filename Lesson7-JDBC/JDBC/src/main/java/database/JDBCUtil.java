package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class JDBCUtil {

    public static Connection getConnection(){
        Connection c = null;

        try {
            DriverManager.registerDriver(new Driver());
            String url= "jdbc:mysql://localhost:3306/QLNHASACH";
            String username= "root";
            String password="password";

            c= DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return c;
    }
    public static void getMetaData(Connection c){
        try {
            if (c!= null){
                java.sql.DatabaseMetaData mtdt = c.getMetaData();
                System.out.println(mtdt.getDriverName()+"\n"+mtdt.getDatabaseProductName());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void disruptConnection(Connection c){
        try {
            if (c!= null)
                c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
