package lesson5;

public class Week {
    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);

        if (x == 1) {

            System.out.println("Monday");
        } else if (x == 2) {

            System.out.println("Tuesday");
        } else if (x == 3) {

            System.out.println("Wednesday");
        } else if (x == 4) {

            System.out.println("Thursday");
        } else if (x == 5) {

            System.out.println("Friday");
        } else {

            System.out.println("Weekend");
        }
    }
}
