package Lesson2.Polymorphism.vd5_exercise.building;

import Lesson2.Polymorphism.vd5_exercise.person.Person;

public class FarmHouse extends Building implements Paintable{
    String sizeOfGarden;
    
    public FarmHouse(Person owner, String color , String sizeOfGarden){
        super(owner,color);
        this.sizeOfGarden= sizeOfGarden;
    }

    public void paint(String newColor){
        System.out.println("The farm house will be painted "+ newColor);
        this.color= newColor;
    }
    
    public void print(){
        super.print();
        System.out.println("The size of the garden is "+sizeOfGarden);
    }
}
