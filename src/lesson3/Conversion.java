package lesson3;

public class Conversion {
    public static void main(String[] args) {

        conversionByte((byte) 25);
        System.out.println();
        conversionShort((short) 25648);
        System.out.println();
        conversionChar('?');
        System.out.println();
        conversionInt(35698);
        System.out.println();
        conversionLong((2558961225635453L));
        System.out.println();
        conversionFloat(1896.833F);
        System.out.println();
        conversionDouble(35698.25648);
    }

    static void conversionByte(byte x) {

        short s = x;
        System.out.println("Byte: " + x + " --> " + "Short: " + s);

        char c = (char) x;
        System.out.println("Byte: " + x + " --> " + "Char: " + c);

        int i = x;
        System.out.println("Byte: " + x + " --> " + "Int: " + i);

        long l = x;
        System.out.println("Byte: " + x + " --> " + "Long: " + l);

        float f = x;
        System.out.println("Byte: " + x + " --> " + "Float: " + f);

        double d = x;
        System.out.println("Byte: " + x + " --> " + "Double: " + d);
    }

    static void conversionShort(short x) {

        byte b = (byte) x;
        System.out.println("Short: " + x + " --> " + "Byte: " + b);

        char c = (char) x;
        System.out.println("Short: " + x + " --> " + "Char: " + c);

        int i = x;
        System.out.println("Short: " + x + " --> " + "Int: " + i);

        long l = x;
        System.out.println("Short: " + x + " --> " + "Long: " + l);

        float f = x;
        System.out.println("Short: " + x + " --> " + "Float: " + f);

        double d = x;
        System.out.println("Short: " + x + " --> " + "Double: " + d);
    }

    static void conversionChar(char x) {

        byte b = (byte) x;
        System.out.println("Char: " + x + " --> " + "Byte: " + b);

        short s = (short) x;
        System.out.println("Char: " + x + " --> " + "Short: " + s);

        int i = x;
        System.out.println("Char: " + x + " --> " + "Int: " + i);

        long l = x;
        System.out.println("Char: " + x + " --> " + "Long: " + l);

        float f = x;
        System.out.println("Char: " + x + " --> " + "Float: " + f);

        double d = x;
        System.out.println("Char: " + x + " --> " + "Double: " + d);
    }

    static void conversionInt(int x) {

        byte b = (byte) x;
        System.out.println("Int: " + x + " --> " + "Byte: " + b);

        short s = (short) x;
        System.out.println("Int: " + x + " --> " + "Short: " + s);

        char c = (char) x;
        System.out.println("Int: " + x + " --> " + "Char: " + c);

        long l = x;
        System.out.println("Int: " + x + " --> " + "Long: " + l);

        float f = x;
        System.out.println("Int: " + x + " --> " + "Float: " + f);

        double d = x;
        System.out.println("Int: " + x + " --> " + "Double: " + d);
    }

    static void conversionLong(long x) {

        byte b = (byte) x;
        System.out.println("Long: " + x + " --> " + "Byte: " + b);

        short s = (short) x;
        System.out.println("Long: " + x + " --> " + "Short: " + s);

        char c = (char) x;
        System.out.println("Long: " + x + " --> " + "Char: " + c);

        int i = (int) x;
        System.out.println("Long: " + x + " --> " + "Int: " + i);

        float f = x;
        System.out.println("Long: " + x + " --> " + "Float: " + f);

        double d = x;
        System.out.println("Long: " + x + " --> " + "Double: " + d);
    }

    static void conversionFloat(float x) {

        byte b = (byte) x;
        System.out.println("Float: " + x + " --> " + "Byte: " + b);

        short s = (short) x;
        System.out.println("Float: " + x + " --> " + "Short: " + s);

        char c = (char) x;
        System.out.println("Float: " + x + " --> " + "Char: " + c);

        int i = (int) x;
        System.out.println("Float: " + x + " --> " + "Int: " + i);

        long l = (long) x;
        System.out.println("Float: " + x + " --> " + "Long: " + l);

        double d = x;
        System.out.println("Float: " + x + " --> " + "Double: " + d);
    }

    static void conversionDouble(double x) {

        byte b = (byte) x;
        System.out.println("Double: " + x + " --> " + "Byte: " + b);

        short s = (short) x;
        System.out.println("Double: " + x + " --> " + "Short: " + s);

        char c = (char) x;
        System.out.println("Double: " + x + " --> " + "Char: " + c);

        int i = (int) x;
        System.out.println("Double: " + x + " --> " + "Int: " + i);

        long l = (long) x;
        System.out.println("Double: " + x + " --> " + "Long: " + l);

        float f = (float) x;
        System.out.println("Double: " + x + " --> " + "Float: " + f);
    }
}
