package lesson5;

public class SwitchWeek {
    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);

        switch (x) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }
    }
}
