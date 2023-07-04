import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        TuDien mydict= new TuDien();
        Scanner input= new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n\n-----------------\n");
            System.out.println("1. Thêm từ mới");
            System.out.println("2. Xóa đi một từ");
            System.out.println("3. Tra nghĩa của từ");
            System.out.println("4. In sách sách tất cả các từ trong từ điển");
            System.out.println("5. In ra số lượng các từ");
            System.out.println("6. Xóa tất cả các từ");
            System.out.println("0. Thoát chương trình");
            System.out.print("Mời nhập lựa chọn: ");
            choice= input.nextInt();
            input.nextLine();
            String key, value;

            switch (choice){
                case 1:
                System.out.print("Nhap tu can them: ");
                key= input.nextLine();
                System.out.print("Nghia: ");
                value= input.nextLine();
                mydict.themTu(key, value);
                break;
                case 2:
                System.out.print("Nhap tu can xoa: ");
                key= input.nextLine();
                mydict.xoaTu(key);
                break;
                case 3:
                System.out.print("Nhap tu can tra nghia: ");
                key= input.nextLine();
                System.out.println(key+": "+mydict.traTu(key));
                break;
                case 4:
                mydict.in();
                break;
                case 5:
                System.out.println("So luong tu trong tu dien: "+mydict.soLuongTu());
                break;
                case 6:
                mydict.xoaTatCa();
                break;
                case 0:
                break;
            }
        }
        while (choice !=0);

        input.close();
    }
}
