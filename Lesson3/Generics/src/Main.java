import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        // DSSV lop1= new DSSV();
        DSSV lop1= new DSSV();
        int choice=0;
        do{
            System.out.println("\n\n1. Them sinh vien vao ds\n"
            +"2. In danh sach sinh vien\n"
            +"3. Kiem tra danh sach co rong khong\n"
            +"4. So luong sinh vien co trong danh sach\n"
            +"5. Tim kiem thong tin sinh vien theo ma SV\n"
            +"6. Tim kiem thong tin sinh vien theo ten\n"
            +"7. Sap xep danh sach theo thu tu giam dan diem TB\n"
            +"8. Xoa mot SV ra khoi danh sach\n"
            +"0.Thoat chuong trinh\n");
            System.out.print("Vui long nhap lua chon: ");
            choice= in.nextInt();
            in.nextLine();

            switch(choice){

                case 1:
                System.out.print("Nhap MSV: "); String ma= in.nextLine();
                System.out.print("Nhap ho va ten: "); String ten= in.nextLine();
                System.out.print("Nhap nam sinh: "); int nam= in.nextInt();
                System.out.print("Nhap diem TB: "); Double diemTB= in.nextDouble();
                SinhVien sv= new SinhVien(ma, ten, nam, diemTB);
                lop1.themSV(sv);
                break;

                case 2:
                lop1.in();
                break;

                case 3:
                if (lop1.dsRong()==true)
                System.out.println("Danh sach sinh vien rong!");
                else
                System.out.println("Danh sach sinh vien khong rong!");
                break;

                case 4:
                System.out.println("So luong sinh vien la: "+lop1.soLuongSV());
                break;

                case 5:
                System.out.print("Nhap ma SV: "); ma= in.nextLine();
                SinhVien a= new SinhVien(ma);
                System.out.print(lop1.timSinhVienTheoMa(a));
                break;

                case 6:
                System.out.print("Nhap ten SV can tim: "); ten= in.nextLine();
                lop1.timSinhVienTheoTen(ten);
                break;

                case 7:
                System.out.println("Danh sach SV sau khi sap xep: \n");
                lop1.sapXep();
                lop1.in();
                break;

                case 8:
                System.out.print("Nhap ma SV: "); ma= in.nextLine();
                SinhVien b= new SinhVien(ma);
                lop1.xoa(b);
                System.out.println("Da xoa thanh cong\n");
                break;

                case 0:
                break;
            }
        }
        while (choice != 0);
        in.close();
    }
}
