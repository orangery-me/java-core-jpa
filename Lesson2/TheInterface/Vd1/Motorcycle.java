package Vd1;

public class Motorcycle {
    public String transportType= "terrestrial";
    
    public int wheels;
    public Motorcycle(int wheels){
        this.wheels= wheels;
    }
    public String getTransportType(){
        return this.transportType;
    }
    public boolean hasWheels(){
        return (this.wheels >0);
    }
    public int getNumberOfWheels(){
        return wheels;
    }
}
