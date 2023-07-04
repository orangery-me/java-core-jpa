import java.io.File;


public class Test01 {

    public static void xoaFile(File f){
        if (f.isFile()){
            System.out.println(f.getName());
            f.delete();
        }
        else
            if (f.isDirectory()){
                File[] sub= f.listFiles();
                for (File file : sub) {
                    xoaFile(file);
                }
                System.out.println(f.getName());
                f.delete();
            }
    }
    public static void main(String[] args) throws Exception {
        // Xoa bang FIle
               // Kiem tra thu muc/ tap tin co ton tai hay ko
                File folder1= new File("/Users/dinhbaochauthi/Documents/Study/Java_Fundamental/Lesson4/WorkWithFile/dict1/vd1/vd1.txt");
                File folder2= new File("/Users/dinhbaochauthi/Documents/Study/Java_Fundamental/Lesson4/WorkWithFiles");
        
                System.out.println("Ton tai ? "+ folder1.exists());
                System.out.println("Ton tai ? "+ folder2.exists());
        
                // Tao thu muc moi
                File folder3= new File("/Users/dinhbaochauthi/Documents/Study/Java_Fundamental/Lesson4/WorkWithFile/dict1");
                folder3.mkdir();
        
                // Tao tap tin (co phan mo rong: exe, cpp, txt,..)
                File file1= new File("/Users/dinhbaochauthi/Documents/Study/Java_Fundamental/Lesson4/WorkWithFile/dict1/vd1.txt");
                file1.createNewFile();

                // Xoa di 1 file/ thu muc
                // File file2= new File("/Users/dinhbaochauthi/Documents/Study/Java_Fundamental/Lesson4/WorkWithFile/vd1.exe");
                // file2.deleteOnExit();

                // xoaFile(file1);

        // Xoa bang Files
            // Path p= folder1.toPath();
            // Files.deleteIfExists(p);
    }
}
