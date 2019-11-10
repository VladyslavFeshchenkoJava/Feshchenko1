package lesson17;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function <Integer,String>function=f->(f>=0)?"Positive number or 0":"Negative number";
        System.out.println(function.apply(-6));
    }
}
