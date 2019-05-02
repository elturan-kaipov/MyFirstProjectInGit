package staticvariables;

public class Calculations {
    public static void main(String[] args) {
        System.out.println(Calculator.add(12,12));
        System.out.println(Calculator.minus(12,10));
        Calculator myCal=new Calculator();
        System.out.println(myCal.multiply(10,2));
        System.out.println(myCal.add(12,12));
        System.out.println(myCal.minus(10,4));

        myCal.operator="Math calculations";



    }
}
