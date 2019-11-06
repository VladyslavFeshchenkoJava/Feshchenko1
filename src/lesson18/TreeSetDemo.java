package lesson18;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        SortedSet<HeavyBox> set = new TreeSet<>();
        set.add(new HeavyBox(1, 1, 1, 3));
        set.add(new HeavyBox(24, 24, 24, 2));
        set.add(new HeavyBox(5, 5, 5, 1));

        set.forEach(System.out::println);
    }
}
