package test;

import dao.UserDAO;
import model.User;

public class TestUserDAO {
    public static void main(String[] args) {
        UserDAO userDAO= new UserDAO();
        // User user1= new User("hoi an", "923");
        // userDAO.add(user1);
        System.out.println(userDAO.selectByID("ab' or 1=1 -- ").toString());
    }
}
