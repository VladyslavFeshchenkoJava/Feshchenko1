package lesson5;

import java.util.Scanner;

public class IfElseIfDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer number");

        if (scanner.hasNextInt()) {

            int x = scanner.nextInt();

            if (x >= 0 && x < 10) {

                System.out.println("A positive number less than 10");
            } else {

                System.out.println("A positive number is greater than 10 or a negative number");
            }
        } else {

            System.out.println("You entered not integer number");
        }
    }
}
