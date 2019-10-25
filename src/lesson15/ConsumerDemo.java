package lesson15;

import lesson11.Drum;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Drum> consumer = drum -> System.out.println("Play drum with size " + drum.getSize());
        consumer.accept(new Drum("24"));
    }
}
