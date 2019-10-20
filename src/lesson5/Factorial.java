package lesson5;

public class Factorial {
    public static void main(String[] args) {

        long x = 1;
        long n = (long) (Math.random() * 20);

        for (int i = 1; i <= n; i++) {

            x *= i;
        }

        System.out.println(n + "! = " + x);
    }
}
