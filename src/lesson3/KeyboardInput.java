package lesson3;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = inputValue(scanner);
        int y = inputValue(scanner);

        System.out.println(x + " + " + y + " = " + (x + y));
    }

    static int inputValue(Scanner scanner) {

        System.out.println("Enter a integer number:");
        while (!scanner.hasNextInt()) {

            scanner.next();
            System.out.println("You entered not integer number, try again:");
        }
        return scanner.nextInt();
    }
}
