package test;

import java.sql.Date;

import dao.SachDAO;
import model.Sach;

public class TestSachDAO {
    public static void main(String[] args) {
        SachDAO sachDAO= new SachDAO();
        // Sach sach1= new Sach("101", "Con duong Hoi giao", "Nguyen Phuong Mai",new Date(2013,1,1), 130000);
        // Sach sach2= new Sach("102", "Ke trom sach", "Markus Zusak", new Date(2015, 01, 01), 200000);

        // sachDAO.add(sach1);
        // sachDAO.add(sach2);

        // sachDAO.update(sach1);

        // sachDAO.delete(sach1);

        // System.out.println(sachDAO.selectByID(101).toString());

        // for (Sach sach : sachDAO.selectAll()) {
        //     System.out.println(sach.toString());
        // }
        
        String condition="SELECT * FROM SACH WHERE GIABAN <= 130000;";
        for (Sach sach : sachDAO.selectByCondition(condition)) {
            System.out.println(sach.toString());
        }

    }
}
