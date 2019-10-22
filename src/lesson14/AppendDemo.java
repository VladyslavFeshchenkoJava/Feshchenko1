package lesson14;

public class AppendDemo {
    public static void main(String[] args) {

        StringBuilder stringBuilder = createString(3, 56);
        System.out.println(stringBuilder);

        replace(stringBuilder);
        System.out.println(stringBuilder);
    }

    public static StringBuilder createString(int a, int b) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a).append("+").append(b).append("=").append(a + b).append("\n");
        stringBuilder.append(a).append("-").append(b).append("=").append(a - b).append("\n");
        stringBuilder.append(a).append("*").append(b).append("=").append(a * b);
        return stringBuilder;
    }

    public static void replace(StringBuilder stringBuilder) {
        int pos;

        while ((pos = stringBuilder.indexOf("=")) != -1) {
            //stringBuilder.deleteCharAt(pos).insert(pos, " is ");
            stringBuilder.replace(pos, pos + 1, " is ");
        }
    }
}
