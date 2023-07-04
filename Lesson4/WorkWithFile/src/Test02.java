
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Test02 {

    public static void copyAll(File f1, File f2){
        // Copy chính f1 vào f2
        try {
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        // Nếu f1 là thư mục -> có thư mục/ tập tin con -> copy tiếp
        if ( f1.isAbsolute() && f1.listFiles() != null){
            File[] subset= f1.listFiles();
            for (File file : subset) {

                    File file_copy= new File(f2.getAbsolutePath()+"/"+file.getName());
                    copyAll(file, file_copy);
        
            }
        }
    }
    public static void main(String[] args){

        // Thay doi ten file thong qua ham --> rsc.renameTo(dsn) trong class File
        File file1= new File("/Users/dinhbaochauthi/Documents/Study/Java_Fundamental/Lesson4/WorkWithFile/src/file1.txt");
        File file2= new File("/Users/dinhbaochauthi/Documents/Study/Java_Fundamental/Lesson4/WorkWithFile/src/file2.txt");
        file1.renameTo(file2);

        // Thay đổi tên file thông qua hàm move trong class Files
        try {
            Files.move(file1.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        // Di chuyển file sang folder khác
        // Tạo biến file chứa địa chỉ mới
        // Hàm move để di chuyển file ở địa chỉ cũ sang file ở địa chỉ mới

        File file3= new File("/Users/dinhbaochauthi/Documents/Study/Java_Fundamental/Lesson4/WorkWithFile/dict1/file2.txt");
        try {
            Files.move(file2.toPath(), file3.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        // Copy file 
        File dict= new File("/Users/dinhbaochauthi/Documents/Study/Java_Fundamental/Lesson4/WorkWithFile/dict1");
        File dict_copy= new File("/Users/dinhbaochauthi/Documents/Study/Java_Fundamental/Lesson4/WorkWithFile/src/dict1_copy");
        try {
            Files.copy(dict.toPath(), dict_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        // Copy tất cả
        copyAll(dict, dict_copy);
    }
}
