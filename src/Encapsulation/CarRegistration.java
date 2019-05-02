package Encapsulation;

public class CarRegistration {
    public static void main(String[] args) {

        Car car1=new Car();
        car1.setCarInfo("Coupe", "BMW", "x5", 200);
        System.out.println(car1.getCarInfo());

        Car car2=new Car();
        System.out.println(car2.getCarInfo());
    }
}
