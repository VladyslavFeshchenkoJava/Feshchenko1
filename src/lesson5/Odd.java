package lesson5;

public class Odd {
    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);

        if (x % 2 != 0) {

            System.out.println(x + " is odd number");
        }
    }
}
