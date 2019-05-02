package Methods;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        add(23,34);
        substract(23,10);
        multiply(10,23);
        divide(0,5);

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose operator: /n+" +
                "1-add /n" +
                "2-substruct /n" +
                "3-multiply /n" +
                "4-divide");
        int operation = scan.nextInt();

        switch (operation) {
            case 1:
                add(1, 1);
                break;
            case 2:
                substract(23, 10);
                break;
            case 3:
                multiply(10, 2);
                break;
            case 4:
                divide(20, 10);
                break;
            default:
                System.out.println("Error");
        }

        }
        public static void add ( double num1, double num2){
            System.out.println(num1 + num2);
        }
        public static void substract ( double num1, double num2){
            System.out.println(num1 - num2);
        }
        public static void multiply ( double num1, double num2){
            System.out.println(num1 * num2);
        }
        public static void divide ( double num1, double num2){
            if (num2 == 0) {
                System.out.println("Error");
            } else {
                System.out.println(num1 / num2);
            }
        }
}
