package lesson5;

public class MultipleOfFive {
    public static void main(String[] args) {

        int i = 0;

        do {

            if (i % 5 == 0) {

                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }
}
