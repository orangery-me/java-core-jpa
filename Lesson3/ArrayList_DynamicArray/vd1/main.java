package Lesson3.ArrayList_DynamicArray.vd1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList <String>();
        list.add("banana");
        System.out.println(list.toString());

        Scanner scan= new Scanner(System.in); // Đọc dữ liệu từ người dùng 
        // Có thể dùng scanner để đọc dữ liệu từ file có sẵn
        System.out.println("Input EXIT when you have finished !");
        String item="";
        do{
            item= scan.next();
            // Nếu trong list đã có từ sắp nhập
            if ( (!list.contains(item) ) && (!item.equals("EXIT")) ){
                list.add(item); // neếu trong list chưa có item và người dùng chưa nhập exit 
                // thì thêm từ người dùng nhập vào trong list
            }
        }
        while (!(item.equals("EXIT") ));
        System.out.println(list);

    }
}