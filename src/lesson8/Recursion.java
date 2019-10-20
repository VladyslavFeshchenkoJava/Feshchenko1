package lesson8;

public class Recursion {
    public static void main(String[] args) {

        int a = 10;
        int b = 100;

        recursionToReduce(a, b);
        recursionToIncrease(a, b);
    }

    static void recursionToReduce(int x, int y) {

        if (y < x)
            return;

        System.out.println(y);

        recursionToReduce(x, y - 1);
    }

    static void recursionToIncrease(int x, int y) {

        if (y < x)
            return;

        System.out.println(x);

        recursionToIncrease(x + 1, y);

    }
}
