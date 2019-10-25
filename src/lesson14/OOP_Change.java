package lesson14;

public class OOP_Change {
    public static void main(String[] args) {
        System.out.println(changer("Object-oriented programming is a programming language model organized" +
                        " around objects rather than \"actions\" and data rather than logic. " +
                        "Object-oriented programming bla bla. Object-oriented programming bla.",
                "object-oriented programming"));
    }

    public static StringBuilder changer(String string, String str) {
        StringBuilder stringBuilder = new StringBuilder(string.toLowerCase());
        StringBuilder stringBuilder1 = new StringBuilder(string);
        int pos;
        int count = 0;
        while ((pos = stringBuilder.indexOf(str.toLowerCase())) != -1) {
            stringBuilder.delete(pos, pos + str.length());
            pos = pos + str.length();
            count++;
            if (count % 2 == 0) {
                stringBuilder1.replace(pos, pos + str.length(), "OOP");
            }
        }
        return stringBuilder1;
    }
}
