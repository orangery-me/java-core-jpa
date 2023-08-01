package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.User;

public class UserDAO implements DAO<User,String> {

    @Override
    public int add(User t) {
        try {
            // b1:
            Connection c = JDBCUtil.getConnection();
            // b2: Tạo đối tượng statement
            // b3:
            String query = "INSERT INTO USER VALUES(?, ?);";
            // System.out.println(query);
            PreparedStatement pst = c.prepareStatement(query);
            pst.setString(1, t.getUsername());
            pst.setString(2, t.getPassword());
            int check = pst.executeUpdate();

            System.out.println(check + " dong da thay doi");
            JDBCUtil.disruptConnection(c);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(User t) {
        try {
            // b1:
            Connection c = JDBCUtil.getConnection();
            // b2: Tạo đối tượng statement
            // b3:
            String query = "UPDATE USER SET PASSWORD=? WHERE USERNAME=? ;";
            PreparedStatement st = c.prepareStatement(query);

            st.setString(1, t.getPassword());
            st.setString(2, t.getUsername());
            int check = st.executeUpdate();

            System.out.println(check + " dong da thay doi");
            JDBCUtil.disruptConnection(c);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int delete(User t) {
        try {
            // b1:
            Connection c = JDBCUtil.getConnection();
            // b2: Tạo đối tượng statement
            String query = "DELETE FROM USER WHERE USERNAME= ?;";
            PreparedStatement st = c.prepareStatement(query);

            st.setString(1, t.getUsername());
            int check = st.executeUpdate();

            System.out.println(check + " dong da thay doi");
            JDBCUtil.disruptConnection(c);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public ArrayList<User> selectAll() {
        ArrayList<User> users = new ArrayList<User>();
        try {
            // b1:
            Connection c = JDBCUtil.getConnection();
            // b2: Tạo đối tượng statement
            Statement st = c.createStatement();
            // b3:
            String query = "SELECT * FROM USER;";
            System.out.println(query);
            ResultSet result = st.executeQuery(query);
            while (result.next()) {
                String username = (String) result.getObject("USERNAME");
                String password = (String) result.getObject("PASSWORD");
                User user = new User(username, password);
                users.add(user);
            }

            JDBCUtil.disruptConnection(c);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public User selectByID(String USERNAME) {
        User user = null;
        try {
            Connection c = JDBCUtil.getConnection();
            
            String query = "SELECT * FROM USER WHERE USERNAME=?;";
            PreparedStatement st = c.prepareStatement(query);

            st.setString(1, USERNAME);
            ResultSet result = st.executeQuery();

            while (result.next()) {
                String username = (String) result.getObject("USERNAME");
                String password = (String) result.getObject("PASSWORD");
                user = new User(username, password);
            }

            JDBCUtil.disruptConnection(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public ArrayList<User> selectByCondition(String condition) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectByCondition'");
    }

}
