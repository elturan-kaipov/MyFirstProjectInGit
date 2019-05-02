package ForLoop;

import java.util.Scanner;

public class Divisible2And3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scan.nextInt();
        int number = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                number = i * i;
                System.out.print(number + " ");
            }
        }

    }
}
