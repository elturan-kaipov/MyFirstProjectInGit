package staticvariables;

public class Calculator {

    public static String operator;

    public static double  add(double num1, double num2){
        operator="add";
        return num1+num2;
    }
    public static double minus(double num1, double num2){
        return num1-num2;
    }
    public double multiply(double num1, double num2){
        operator="multiply";
        return num1*num2;
    }

    public static void multiply2(double num1, double num2){

    }

}
