package lesson15;

import java.time.LocalDate;
import java.time.Month;

public class HolidaysDemo {
    public static void main(String[] args) {
        LocalDate newYear = LocalDate.of(2020, Month.JANUARY, 01);
        LocalDate valentinesDay = LocalDate.of(2020, Month.FEBRUARY, 14);
        LocalDate easter = LocalDate.of(2020, Month.APRIL, 19);

        holidays("New Year",newYear);
        holidays("Valentines Day",valentinesDay);
        holidays("Easter",easter);
    }

    public static void holidays(String nameOfHoliday, LocalDate localDate){
        System.out.printf("%16s in %4d will be %10s %4d\n",nameOfHoliday,localDate.getYear(),localDate.getMonth(),
                localDate.getDayOfMonth());
    }
}
