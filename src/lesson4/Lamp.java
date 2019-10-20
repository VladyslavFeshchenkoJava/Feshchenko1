package lesson4;

public class Lamp {
    public static void main(String[] args) {

        int x = 186;

        System.out.println("Initial state is: " + (Integer.toBinaryString(x)));
        System.out.println();

        blink(x);
        System.out.println();

        run(x);
        System.out.println();

        currentStateInFirstPosition(x);
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
}
