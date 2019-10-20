package lesson13;

public class WrappersDemo {
    public static void main(String[] args) {
        Double d = Double.valueOf("35.786");
        double d1 = Double.parseDouble("356.675");
        int i = (int) Double.parseDouble("3.16");

        System.out.println(d);
        System.out.println(d1);
        System.out.println(i);

        System.out.println(d.byteValue());
        System.out.println(d.shortValue());
        System.out.println(d.intValue());
        System.out.println(d.longValue());
        System.out.println(d.floatValue());
        System.out.println(d.toString());
        System.out.println("11");
    }
}
