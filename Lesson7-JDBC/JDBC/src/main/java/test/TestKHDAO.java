package test;

import dao.KHDAO;
import model.KhachHang;

public class TestKHDAO {
    public static void main(String[] args) {
        KHDAO khDAO= new KHDAO();
        for (KhachHang khachHang: khDAO.selectAll()) {
            System.out.println(khachHang.toString());
        }
    }
}
