package ForLoop;

import java.util.Scanner;

public class OnlyDigits {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word with numbers");
        String str = scan.nextLine();


        if (str.length() < 3 || str.length() > 100) {
            System.out.println("invalid enter");
        } else {

            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    System.out.print(str.charAt(i));
                }
            }

        }

    }
}