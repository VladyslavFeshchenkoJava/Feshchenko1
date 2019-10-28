package lesson14;

import java.time.LocalDate;
import java.time.Month;

public class EmployeeDemo {
    public static void main(String[] args) {
        LocalDate payday = LocalDate.of(2020, Month.NOVEMBER, 5);
        Employee[] employees = {new Employee("John Dou", 3500.89, payday),
                new Employee("Jack Johns", 3298, payday),
                new Employee("Bill Jackson", 2463.35, payday)};

        Report report = new Report();
        FullReport fullReport = new FullReport();

        report.generateReport(employees);
        System.out.println();

        fullReport.generateFullReport(employees, "en", "UK");
        System.out.println();
        fullReport.generateFullReport(employees, "", "");
        System.out.println();
        fullReport.generateFullReport(employees, "en", "US");
    }
}
