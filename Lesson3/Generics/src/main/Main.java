package main;

import java.util.Scanner;

import QLSV.DSSV;
import QLSV.SinhVien;

public class Main {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        DSSV lop1= new DSSV();
        int choice=0;
        do{
            System.out.println("1. Them sinh vien vao ds\n"
            +"2.In danh sach sinh vien\n"
            +"0.Thoat chuong trinh\n");
            System.out.println("Vui long nhap lua chon: ");
            choice= in.nextInt();

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

                break;
                case 0:
                break;
            }
        }
        while (choice != 0);

    }
}
