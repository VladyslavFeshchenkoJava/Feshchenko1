package lesson4;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer number: ");

        if (scanner.hasNextInt()) {

            int x = scanner.nextInt();

            if (x % 2 == 0) {
                System.out.println(x + " is even number");
            } else {
                System.out.println(x + " is odd number");
            }
        } else {
            System.out.println("You entered not integer number");
        }
    }
}
