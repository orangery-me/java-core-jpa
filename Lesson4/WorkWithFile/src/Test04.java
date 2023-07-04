
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.util.List;

public class Test04 {
    public static void main(String[] args){
        // Cach 1: su dung bufferedReader
        try {
            FileReader file= new FileReader("/Users/dinhbaochauthi/Documents/Study/Java_Fundamental/Lesson4/WorkWithFile/dict1/vd1.txt");
            BufferedReader br= new BufferedReader(file);
            String newLine= null;
            while (true){
                newLine = br.readLine();
                if (newLine== null)
                break;
                else
                System.out.println(newLine);
            }
            br.close();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        // Cach 2: Su dung class Files

        File filein= new File("/Users/dinhbaochauthi/Documents/Study/Java_Fundamental/Lesson4/WorkWithFile/dict1/vd1.txt");
        try {
            List<String> allLines= Files.readAllLines(filein.toPath());
            for (String string : allLines) {
                System.out.println(string+" ...");
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
