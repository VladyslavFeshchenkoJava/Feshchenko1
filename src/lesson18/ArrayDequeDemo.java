package lesson18;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<HeavyBox> deque = new ArrayDeque<>();
        deque.offer(new HeavyBox(1, 1, 1, 1));
        deque.offer(new HeavyBox(23, 23, 23, 23));
        deque.offer(new HeavyBox(2, 2, 2, 2));
        deque.offer(new HeavyBox(5, 5, 5, 5));

        while (!deque.isEmpty()){
            System.out.println(deque.poll());
        }
    }
}
