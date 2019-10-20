package lesson4;

import java.util.Scanner;

public class CompareAbsoluteValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integer numbers");

        int x = inputValue(scanner);
        int y = inputValue(scanner);
        int z = inputValue(scanner);

        int xAbsolute = x < 0 ? -x : x;
        int yAbsolute = y < 0 ? -y : y;
        int zAbsolute = z < 0 ? -z : z;

        if (xAbsolute >= yAbsolute && xAbsolute >= zAbsolute) {

            System.out.println("Maximum absolute number is: " + xAbsolute);
        } else if (yAbsolute > xAbsolute && yAbsolute >= zAbsolute) {

            System.out.println("Maximum absolute number is: " + yAbsolute);
        } else {

            System.out.println("Maximum absolute number is: " + zAbsolute);
        }
    }

    static int inputValue(Scanner scanner) {

        System.out.println("Enter a integer number:");
        while (!scanner.hasNextInt()) {

            scanner.next();
            System.out.println("You entered not integer number, try egain:");
        }
        return scanner.nextInt();
    }
}
