package lesson4;

public class IfDemo {
    public static void main(String[] args) {

        String str = args[0];

        int x = Integer.parseInt(str);

        if (x % 2 != 0) {
            System.out.println(x);
        }
    }
}
