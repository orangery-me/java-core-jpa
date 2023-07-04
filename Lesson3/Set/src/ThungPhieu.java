import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class ThungPhieu {
    Set <String> phieutt = new HashSet<String>();

    public boolean themPhieu(String s){
        return this.phieutt.add(s);
    }

    public boolean xoaPhieu(String s){
        return this.phieutt.remove(s);
    }

    public boolean kiemtraPhieu(String s){
        return this.phieutt.contains(s);
    }

    public boolean xoaTatCa(){
        return this.phieutt.removeAll(this.phieutt);
    }

    public int tongPhieu(){
        return this.phieutt.size();
    }

    public String rutNgauNhienMotPhieu(){
        Random rd= new Random();
        int viTri= rd.nextInt(this.phieutt.size());
        String temp= (String)this.phieutt.toArray()[viTri];
        return temp;
    }

    public void inTatCa(){
        System.out.println(Arrays.toString(this.phieutt.toArray()));
    }
    // Thay vi tach rieng file main, viet truc tiep ham main vao file nay
    public static void main(String[] args) throws Exception {
        // Tao doi tuong thuoc lop ThungPhieu -> doi tuong co tat ca cac attribute va method cua lop
        ThungPhieu tp= new ThungPhieu();
        Scanner input= new Scanner(System.in);
        int c;
        do {
            System.out.println("Menu");
            System.out.println("1. Them mot ma so");
            System.out.println("2. Xoa di mot ma so");
            System.out.println("3. Kiem tra mot phieu du thuong co ton tai ko");
            System.out.println("4. Xoa di tat ca cac phieu");
            System.out.println("5. So luong phieu du thuong");
            System.out.println("6. Rut tham trung thuong");
            System.out.println("7. In tat ca cac phieu");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            c= input.nextInt(); 
            input.nextLine();

            String s = new String();

            if (c==1 || c==2|| c==3){
                System.out.print("Nhap vao ma so: ");
                s= input.nextLine(); 
            }

            switch (c){
            case 1:
            tp.themPhieu(s);
            break;
            case 2:
            tp.xoaPhieu(s);
            break;
            case 3:
            tp.kiemtraPhieu(s);
            break;
            case 4:
            tp.xoaTatCa();
            break;
            case 5:
            System.out.println(tp.tongPhieu());
            break;
            case 6:
            System.out.println(tp.rutNgauNhienMotPhieu());
            break;
            case 7:
            tp.inTatCa();
            break;
            case 0:
            break;
            }
        }
        while (c !=0);
        input.close();;

    }
}
