package lesson14;

public class MidLine {
    public static void main(String[] args) {
        System.out.println(middleChars("string"));
    }

    public static String middleChars(String string) {
        return String.valueOf(new char[]{string.charAt(string.length() / 2 - 1),
                string.charAt(string.length() / 2)});
    }
}
