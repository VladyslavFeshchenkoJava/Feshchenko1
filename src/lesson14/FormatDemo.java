package lesson14;

public class FormatDemo {
    public static void main(String[] args) {

        print("AAAAA", "physics", 5);
        print("BBBB", "mathematics", 4);
        print("CCCC", "programing", 2);
    }

    public static void print(String fullName, String subject, int mark) {

        System.out.printf("Student %15s get %3d for %12s%n", fullName, mark, subject);
    }
}
