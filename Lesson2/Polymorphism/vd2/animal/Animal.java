package Lesson2.Polymorphism.vd2.animal;

public class Animal {
    protected boolean hasEaten;

    public Animal(){
        hasEaten= false;
    }

    public void eat(){
        System.out.println("The animal is eating..");
        hasEaten= true;
    }

    public boolean getHasEaten(){
        return this.hasEaten;
    }

}
