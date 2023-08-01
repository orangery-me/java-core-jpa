package model;

import java.sql.Date;

public class Sach {
    private String id;
    private String tenSach;
    private String tacGia;
    private Date namXB;
    private int giaBan;
    public Sach(){};
    public Sach(String id, String tenSach, String tacGia, Date namXB, int giaBan) {
        this.id = id;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXB = namXB;
        this.giaBan = giaBan;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTenSach() {
        return tenSach;
    }
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }
    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    public Date getNamXB() {
        return namXB;
    }
    public void setNamXB(Date namXB) {
        this.namXB = namXB;
    }
    public int getGiaBan() {
        return giaBan;
    }
    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
    @Override
    public String toString() {
        return "Sach [id=" + id + ", tenSach=" + tenSach + ", tacGia=" + tacGia + ", namXB=" + namXB + ", giaBan="
                + giaBan + "]";
    }
    
    
}
