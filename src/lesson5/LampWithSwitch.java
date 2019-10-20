package lesson5;

import java.util.Scanner;

public class LampWithSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = 186;

        System.out.println("Initial state is: " + (Integer.toBinaryString(x)));
        System.out.println();

        System.out.println("Enter action for garland: 1 - blink; 2 - run; 3 - current state in first position.");
        int action = inputValue(scanner);

        switch (action) {

            case 1:
                blink(x);
                break;
            case 2:
                run(x);
                break;
            case 3:
                currentStateInFirstPosition(x);
                break;
            default:
                System.out.println("You entered ron number");
        }
    }

    static void blink(int x) {

        System.out.println("Blink");

        for (int i = 0; i < 5; i++) {

            x = ~x;
            System.out.println("Current state is: " + (Integer.toBinaryString(x)));
        }
    }

    static void run(int x) {

        System.out.println("Run");

        for (int i = 0; i < 5; i++) {

            x <<= 1;
            System.out.println("Current state is: " + Integer.toBinaryString(x));
        }
    }

    static void currentStateInFirstPosition(int x) {

        System.out.println("Current state in first position");

        if ((x & 1) == 0) {

            System.out.println("The lamp is off");
        } else {

            System.out.println("The lamp is on");
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
