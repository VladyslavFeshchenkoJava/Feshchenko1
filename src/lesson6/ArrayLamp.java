package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLamp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[32];

        initialArr(arr);

        System.out.println("Enter action for garland: 1 - blink; 2 - run; 3 - current state in first position.");
        int action = inputValue(scanner);

        switch (action) {

            case 1:
                System.out.println("Blink");
                blink(arr);
                break;

            case 2:
                System.out.println("Run");
                run(arr);
                break;

            case 3:
                System.out.println("Current state in first position");
                currentStateInFirstPosition(arr);
                break;

            default:
                System.out.println("You entered ron number");

        }
    }

    static void run(int[] arr) {

        for (int i = 0; i < 5; i++) {


            for (int j = 1; j < arr.length - 1; j++) {

                System.arraycopy(arr, j, arr, j - 1, 1);
                arr[arr.length - 1] = arr[0];
            }

            System.out.println(Arrays.toString(arr));
        }
    }

    static void blink(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                arr[i] = 1;
            } else {

                arr[i] = 0;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    static void currentStateInFirstPosition(int[] arr) {

        if (arr[0] == 1) {

            System.out.println("First lamp is on");
        } else {

            System.out.println("First lamp is off");
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

    static int[] initialArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            double d = Math.random();
            if (d < 0.5) {

                arr[i] = 0;
            } else {

                arr[i] = 1;
            }
        }

        System.out.println(Arrays.toString(arr));

        return arr;
    }
}
