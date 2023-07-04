package Lesson2.Polymorphism.vd2.animal;

public class Bear extends Animal{
    public String color ;

    public Bear(String color){
        super();
        this.color= color;
    }

    public void eat(){
        System.out.println("The bear went fishing before eating.");
        super.eat();
        System.out.println("has eaten yet ? "+ hasEaten);
    }
}
