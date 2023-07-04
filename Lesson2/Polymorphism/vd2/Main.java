package Lesson2.Polymorphism.vd2;

import Lesson2.Polymorphism.vd2.animal.Animal;
// import Lesson2.Polymorphism.vd2.animal.Bear;
import Lesson2.Polymorphism.vd2.animal.PolarBear;

public class Main {
    public static void main(String[] args){
       Animal animal= new Animal();
    //    Bear americanBear= new Bear("brown");
       PolarBear whiteBear= new PolarBear();

       animal.eat();
    //    americanBear.eat();
       whiteBear.eat();

    //    System.out.println("Has the polar bear eaten yet? "+ whiteBear.getHasEaten());
    System.out.println(whiteBear.color);
    }
}
