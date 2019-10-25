package lesson16;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer,String> function =i->
        {
            if (i<0){
                return "negative number";
            } else if (i>0){
                return "positive number";
            }else {
                return "zero";
            }
        };

        System.out.println(function.apply(9));
        System.out.println(function.apply(-9));
        System.out.println(function.apply(0));
    }
}
