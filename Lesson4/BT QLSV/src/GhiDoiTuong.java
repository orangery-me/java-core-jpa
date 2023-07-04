import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class GhiDoiTuong {
    public static void main(String[] args){

        try {
            File file= new File("/Users/dinhbaochauthi/Documents/Study/Java_Fundamental/Lesson4/BT QLSV/src/output.txt");
            OutputStream os= new FileOutputStream(file);
            ObjectOutputStream oos= new ObjectOutputStream(os);
            
            SinhVien sv= new SinhVien("001", "Thi", 2004, 9.3);
            oos.writeObject(sv);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }        
    }
}
