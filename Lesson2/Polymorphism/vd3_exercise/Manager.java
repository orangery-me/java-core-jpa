package Lesson2.Polymorphism.vd3_exercise;

public class Manager extends Employee {
    public Manager(int year){
        super(year);
    }

    public double getBonus(){
        return super.getBonus()+10000;
    }

    public double getGrossSalary(){
        return super.getGrossSalary();
    }

    public double getNetSalary(){
        return super.getNetSalary();
    }
}
