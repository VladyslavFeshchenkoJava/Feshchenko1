package lesson4;

public class Average {
    public static void main(String[] args) {

        double average = (Double.parseDouble(args[0]) + Double.parseDouble(args[1]) + Double.parseDouble(args[2])) / 3;

        System.out.println(average);
    }
}
