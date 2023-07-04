package Vd1;


public class Main {
    public static void main(String[] args){
        Car Taxi= new Car(4);

        System.out.println("Taxi has wheel? "+Taxi.hasWheels()+" Number of wheels: "+Taxi.wheels);

        Motorcycle Grab_motor= new Motorcycle(2);

        System.out.println("Grab_motor has wheel? "+Grab_motor.hasWheels()+" Number of wheels: "+Grab_motor.wheels);
    }
}
