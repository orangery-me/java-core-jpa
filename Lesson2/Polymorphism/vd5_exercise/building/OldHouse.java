package Lesson2.Polymorphism.vd5_exercise.building;

import Lesson2.Polymorphism.vd5_exercise.person.Person;

public class OldHouse extends Building {
    private int yearBuilt;

    public OldHouse(Person owner, String color, int yearBuilt){
        super(owner, color);
        this.yearBuilt= yearBuilt;
    }

    public void print(){
        super.print();
        System.out.println("It was built in "+yearBuilt);
    }

}
