package lesson14;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class FullReport {
    public void generateFullReport(Employee[] employees, String language, String country) {
        Locale locale = new Locale(language, country);
        ResourceBundle title = ResourceBundle.getBundle("text", locale);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String str = title.getString("str1");
        System.out.println(str);
        for (Employee e : employees) {
            System.out.printf("Employee %16s with salary %12s\n", e.getFullName(), numberFormat.format(e.getSalary()));
            System.out.printf("Payday is %d %s %d\n", e.getSalaryDate().getYear(),e.getSalaryDate().getMonth(),
                    e.getSalaryDate().getDayOfMonth());
        }
    }
}
