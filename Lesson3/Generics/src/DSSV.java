
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DSSV{
    private ArrayList <SinhVien> ds; 

    public DSSV(){
        this.ds= new ArrayList<SinhVien>();
    }

    public DSSV(ArrayList<SinhVien> ds) {
        this.ds = ds;
    }
// 1. Them sinh vien

    public void themSV(SinhVien sv){
        ds.add(sv);
    }
// 2. in danh sach sinh vien
    public void in(){
        for (SinhVien item: ds){
            System.out.println(item);
        }
    }

// 3. kiem tra ds co rong khong
    public boolean dsRong(){
        if (ds.isEmpty()==true)
        return true;
        return false;
    }
// 4. lay so luong sinh vien trong ds
    public int soLuongSV(){
        return ds.size();
    }

// 5. tim sinh vien dua tren ma SV
    public boolean timSinhVienTheoMa(SinhVien a){
        return ds.contains(a);
    }

// 6. tim sinh vien dua tren ten
    public void timSinhVienTheoTen(String name){
        for (SinhVien sinhVien : ds) {
            if (sinhVien.getName().indexOf(name) >=0 ){
                System.out.println(sinhVien);
            }
        }
    }
// 7. sap xep danh sach sinh vien theo thu tu giam dan diem
    public void sapXep(){
        Collections.sort(ds, new Comparator<SinhVien>() {
            public int compare(SinhVien a, SinhVien b){
                return (a.getDiem() < b.getDiem())? 1:-1;
            }
        });
    }
// 8. xoa mot ban sinh vien
    public boolean xoa(SinhVien a){
        return ds.remove(a);
    }
}
