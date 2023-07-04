import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;

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
        Collections.sort(ds);
    }
// 8. xoa mot ban sinh vien
    public boolean xoa(SinhVien a){
        return ds.remove(a);
    }
// 9. Ghi đối tượng xuông file
    public void ghiDuLieu(){
        // try {
        //     FileWriter fw= new FileWriter("/Users/dinhbaochauthi/Documents/Study/Java_Fundamental/Lesson4/WorkWithFile2/src/output.txt");
        //     BufferedWriter bw= new BufferedWriter(fw);
        //     for (SinhVien sinhVien : ds) {
        //         bw.write(sinhVien.toString()+"\n");
        //         bw.flush();
        //     }
        //     bw.close();

        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }

        try {
            File file= new File("/Users/dinhbaochauthi/Documents/Study/Java_Fundamental/Lesson4/WorkWithFile2/src/output.txt");
            FileOutputStream ops= new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(ops);
            for (SinhVien sinhVien : ds) {
                oos.writeObject(sinhVien);
                oos.flush();
            }
            oos.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
// Đọc đối tượng từ file
    public void DocDoiTuong(String tenFile) {
        try {
            File file= new File(tenFile);
            InputStream is= new FileInputStream(file);
            ObjectInputStream ois= new ObjectInputStream(is);
            SinhVien sv= null;
            while (true){
                Object obj = ois.readObject();
                if (obj == null)
                break;
                else{
                sv= (SinhVien)obj;
                ds.add(sv);
                }
            }
           
            ois.close();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
