package lesson14;

public class FormatDemo {
    public static void main(String[] args) {

        print("AAAA", "fisica", 5);
        print("BBBB", "mathematica", 4);
        print("CCCC", "trud", 2);
    }

    public static void print(String fullName, String subject, int mark) {

        System.out.printf("Student %s get %d for %s%n", fullName, mark, subject);
    }
}
