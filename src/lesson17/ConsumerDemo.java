package lesson17;

import lesson18.HeavyBox;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        HeavyBox heavyBox=new HeavyBox(1,1,1,1);
        Consumer<HeavyBox> shipped = f -> System.out.println("Shipped a box with weight: " + f.weight);
        Consumer<HeavyBox> send = f -> System.out.println("Send a box with weight: " + f.weight);
        shipped.andThen(send).accept(heavyBox);
    }
}
