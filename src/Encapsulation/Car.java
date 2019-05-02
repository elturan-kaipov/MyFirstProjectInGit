package Encapsulation;

public class Car {
    private String type;
    private String make;
    private String model;
    private int speed;

    public Car(){
        System.out.println("Car class Constructor");
        type="unknown";
        make="unknown";
        model="unknown";
    }





    public void setCarInfo(String type, String make, String model, int speed) {
        this.make = make;
        this.type = type;
        this.model = model;
        this.speed = speed;
    }
    public String getCarInfo(){
        String sp=Integer.toString(speed);
        return type+" | "+make+" | "+model+" | "+sp+" mph";
    }


}
