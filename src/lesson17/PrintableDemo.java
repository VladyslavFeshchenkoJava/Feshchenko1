package lesson17;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable printable=new Printable() {
            @Override
            public void print() {
                System.out.println("Some string");
            }
        };
    }
}
