public class SinhVien implements Comparable <SinhVien> {

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

    public SinhVien(String maSV){
        this.maSV= maSV;
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

    @Override
    public String toString() {
        return "SinhVien [maSV=" + maSV + ", name=" + name + ", year=" + year + ", diem=" + diem + "]";
    }

    public int compareTo(SinhVien a){
        return this.maSV.compareTo(a.maSV);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((maSV == null) ? 0 : maSV.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SinhVien other = (SinhVien) obj;
        if (maSV == null) {
            if (other.maSV != null)
                return false;
        } else if (!maSV.equals(other.maSV))
            return false;
        return true;
    }
    // Hàm contains(obj): kiểm tra xem obj tham số có bằng với bất kì obj nào trong ArrayList hay không
    // Nhưng thế nào là 2 obj bằng nhau ? => override lại hàm equals có sẵn trong class Object 
    // Hàm remove(obj): Xóa đi obj bằng với obj có trong ArrayList

}
