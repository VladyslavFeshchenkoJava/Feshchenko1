package lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String stringPattern = "Java\\s*\\d?";
        String text = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        Pattern pattern=Pattern.compile(stringPattern);
        Matcher matcher=pattern.matcher(text);
        while (matcher.find()){
            System.out.println(text.substring(matcher.start(),matcher.end()));
        }
    }
}
