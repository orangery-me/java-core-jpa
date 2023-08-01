package model;

public class KhachHang {
    private Integer idKH;
    private String hoTen;
    private java.sql.Date ngaySinh;
    private String SDT;
    public KhachHang(){}
    public KhachHang(Integer idKH, String hoTen, java.sql.Date ngaySinh, String sDT) {
        this.idKH = idKH;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        SDT = sDT;
    }
    public Integer getIdKH() {
        return idKH;
    }
    public void setIdKH(Integer idKH) {
        this.idKH = idKH;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public java.sql.Date getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(java.sql.Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String getSDT() {
        return SDT;
    }
    public void setSDT(String sDT) {
        SDT = sDT;
    }
    @Override
    public String toString() {
        return "KhachHang [idKH=" + idKH + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", SDT=" + SDT + "]";
    };
    
}
