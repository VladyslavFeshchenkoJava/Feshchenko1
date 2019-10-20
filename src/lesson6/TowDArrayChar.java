package lesson6;

public class TowDArrayChar {
    public static void main(String[] args) {

        char[][] arr = {
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'g', 'h'}
        };

        for (char[] arrOne : arr) {
            for (char elem : arrOne) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
