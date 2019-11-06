package lesson16;

public class Calculator {
    public static <T extends Number,V extends Number>  void Calculator( T x, V y) {
        double sum;
        sum=x.doubleValue()+y.doubleValue();
        double mult;
        mult=x.doubleValue()*y.doubleValue();
    }
}