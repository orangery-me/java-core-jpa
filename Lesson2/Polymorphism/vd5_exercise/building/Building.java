package Lesson2.Polymorphism.vd5_exercise.building;

import Lesson2.Polymorphism.vd5_exercise.person.Person;

public class Building {
    protected Person owner;
    protected String color;

    public Building(Person owner, String color){
        this.owner= owner;
        this.color= color;
        owner.buildOne();
    }

    public void print(){
        System.out.println("Owner "+ this.owner.getName()+" has a building in "+color );
    }

}
