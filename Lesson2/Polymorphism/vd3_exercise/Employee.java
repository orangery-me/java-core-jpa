package Lesson2.Polymorphism.vd3_exercise;

public class Employee implements Taxes{
    public int yearEmployed;
    public double baseTime=40000;

    public Employee(int year){
        yearEmployed= year;
    }

    public double getBonus(){
        return 1000*yearEmployed;
    }

    public double getGrossSalary(){
        return baseTime+ getBonus();
    }

    public double getNetSalary(){
        return getGrossSalary()- getGrossSalary()*Taxes.getTaxesRate(getGrossSalary());
    }

}
