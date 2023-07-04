package model;

import java.util.StringTokenizer;

public class menuModel {
    private String mainDish;
    private String subDish;
    private double bill;

    public menuModel() {
        this.mainDish = "";
        this.subDish = "";
        this.bill = 0;
    }
    public String getMainDish() {
        return mainDish;
    }
    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }
    public String getSubDish() {
        return subDish;
    }
    public void setSubDish(String subDish) {
        this.subDish = subDish;
    }
    public double getBill() {
        return bill;
    }
    public void setBill(double bill) {
        this.bill = bill;
    }
    public void calSumBill() {
        double sum=0;
        if (this.mainDish.equals("COM TAM 25k"))
            sum+= 25;
        if (this.mainDish.equals("BUN BO HUE 40k"))
            sum+= 40;
        if (this.mainDish.equals("BUN DAU MAM TOM 35k"))
            sum+= 35;
        if (this.mainDish.equals("MI QUANG 30k"))
            sum+= 30;
        
        StringTokenizer stk= new StringTokenizer(subDish,";");
        while (stk.hasMoreElements()){
            String b= stk.nextToken();
            b=b.trim();
            System.out.println(b);
            if (b.equals("DUA MUOI 5k"))
                sum+=5 ;
            if (b.equals("TRUNG OP LA 8k"))
                sum+=8;
            if (b.equals("BANH QUAY 5k"))
                sum+=5 ;
            if (b.equals("DAU KHUON CHIEN 10k"))
                sum+=10 ;
            if (b.equals("DOI CHIEN 15k"))
                sum+=15;
            if (b.equals("CHA COM 15k"))
                sum+=15;
            if (b.equals("BANH TRANG 5k"))
                sum+=5;
            
        }

        this.bill= sum;
    }
}
