
import java.io.PrintWriter;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args){
        try {
            PrintWriter pw= new PrintWriter("/Users/dinhbaochauthi/Documents/Study/Java_Fundamental/Lesson4/WorkWithFile/dict1/vd1.txt");
            pw.println("Xin chao, world");
            pw.print("My name is: ");
            Scanner sc= new Scanner(System.in);
            String name= sc.nextLine();
            pw.println(name);
            pw.close();
            sc.close();
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
