package QLSV;

public class SinhVien {

    private String maSV;
    private String name;
    private int year;
    private double diem;

    public SinhVien(String maSV, String name, int year, double diem){
        this.maSV= maSV;
        this.name= name;
        this.year= year;
        this.diem= diem;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getDiem() {
        return diem;
    }

    public void print(){
        System.out.println( "Ma SV: "+ this.getMaSV() );
        System.out.println( "Ho va ten: "+ this.getName() );
        System.out.println( "Nam sinh: "+ this.getYear() );
        System.out.println( "Diem TB: "+ this.getDiem() );
    }

}
