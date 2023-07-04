package Lesson2.Polymorphism.vd5_exercise;

import Lesson2.Polymorphism.vd5_exercise.building.FarmHouse;
import Lesson2.Polymorphism.vd5_exercise.building.OldHouse;
import Lesson2.Polymorphism.vd5_exercise.person.Person;

public class Main {
    public static void main(String[] args){
        Person Thi= new Person("Chau Thi");
        OldHouse CuaHang= new OldHouse(Thi, "green",2002);
        FarmHouse Vuon= new FarmHouse(Thi, "black", "10m x 10m");

        Thi.print();
        CuaHang.print();
        Vuon.print();

        Vuon.paint("white");
    }

}
