package lesson14;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] employees = {new Employee("John Dou", 3500.89),
                new Employee("Jack Johns", 3298),
                new Employee("Bill Jackson", 2463.35)};

        Report report = new Report();
        report.generateReport(employees);
    }
}
