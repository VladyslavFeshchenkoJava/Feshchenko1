package lesson13;

public class StringDemo {
    public static void main(String[] args) {

        verifyString("I like Java");
        System.out.println(getLastChar("I like Java"));
        System.out.println(getIndex("I like Java"));
        System.out.println(upper("I like Java"));
        System.out.println(lower("I like Java"));
        System.out.println(sub("I like Java"));
        System.out.println(replaceAToO("I like Java"));
    }

    public static void verifyString(String str) {
        System.out.println(str.endsWith("ava"));
        System.out.println(str.startsWith("I l"));
        System.out.println(str.contains("Ike"));
        System.out.println(str.regionMatches(3, "ike J", 0, 2));
    }

    public static char getLastChar(String str) {

        return str.charAt(str.length() - 1);
    }

    public static int getIndex(String str) {

        return str.indexOf("Java");
    }

    public static String upper(String str) {
        return str.toUpperCase();
    }

    public static String lower(String str) {
        return str.toLowerCase();
    }

    public static String sub(String str) {
        return str.substring(7);
    }

    public static String replaceAToO(String str) {
        return str.replace('a', 'o');
    }
}
