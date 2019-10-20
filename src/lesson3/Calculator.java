package lesson3;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(sum(5, 2));
        System.out.println(sub(5, 2));
        System.out.println(div(5, 2));
        System.out.println(mult(5, 2));
    }

    static int sum(int x, int y) {
        return x + y;
    }

    static int sub(int x, int y) {
        return x - y;
    }

    static double div(double x, double y) {
        return x / y;
    }

    static double mult(double x, double y) {
        return x * y;
    }
}
