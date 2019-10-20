package lesson13;

public class StringDemo {
    public static void main(String[] args) {

        verifyString("I like Java");
        System.out.println(getLastChar("I like Java"));

    }

    public static void verifyString (String str){
        System.out.println(str.endsWith("ava"));
        System.out.println(str.startsWith("I l"));
        System.out.println(str.contains("Ike"));
        System.out.println(str.regionMatches(3,"ike J",0,2));
    }

    public static char getLastChar(String str){

        return str.charAt(str.length()-1);
    }

    public static int getIndex(String str){

        return str.indexOf("Java");
    }
}
