package Lesson2.Polymorphism.vd3_exercise;

public class Main {
    public static void main(String[] args){
        Employee Thi= new Employee(6);
        Manager Thao= new Manager(8);

        System.out.println("Employee salary is : "+ Thi.getNetSalary());
        System.out.println("Manager salary is : "+ Thao.getNetSalary());
    }
}
