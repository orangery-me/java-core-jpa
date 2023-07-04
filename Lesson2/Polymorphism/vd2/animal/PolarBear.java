package Lesson2.Polymorphism.vd2;

public class PolarBear extends Bear{

    public PolarBear(){
        super("white");
    }

    public void eat(){
        super.eat();
        System.out.println("The bear likes eating salmons");
    }
    
}
