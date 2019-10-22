package lesson14;

public class OOP_Change {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Object-oriented programming is a programming language " +
                "model organized around objects rather than \"actions\" and data rather than logic." +
                " Object-oriented programming bla bla. Object-oriented programming bla.");
        changer(stringBuilder, "Object-oriented programming");
        System.out.println(stringBuilder);
    }

    public static void changer(StringBuilder stringBuilder, String string) {
        int pos;
        int count = 0;
        while ((pos = stringBuilder.indexOf(string)) != -1) {
            if (pos >=0) {
                count++;
                if ((count/2) % 2 != 0)
                    stringBuilder.replace(pos, pos + string.length(), "OOP");
            }
        }
        System.out.println(count);
    }
}
