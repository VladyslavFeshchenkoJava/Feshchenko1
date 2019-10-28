package lesson14;

import java.util.Locale;

public class Report {
    public void generateReport(Employee[] employees) {
        for (Employee e : employees) {
            System.out.printf("Employee %16s with salary %10.2f", e.getFullName(), e.getSalary());
            System.out.println();
        }
    }
}
