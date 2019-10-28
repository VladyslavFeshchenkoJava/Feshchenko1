package lesson15;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate myBirthDay = LocalDate.of(1975, Month.AUGUST, 15);
        LocalDate today = LocalDate.now();
        boolean after = myBirthDay.isAfter(today);
        boolean before = myBirthDay.isBefore(today);

        System.out.print(myBirthDay.getYear() + ".");
        System.out.print(myBirthDay.getMonth() + ".");
        System.out.println(myBirthDay.getDayOfMonth());
        System.out.println(myBirthDay.getDayOfWeek());
        System.out.println(myBirthDay.getDayOfYear());
        System.out.println();
        System.out.println("myBirthDay.isAfter(today): " + after);
        System.out.println("myBirthDay.isBefore(today): " + before);
    }
}
