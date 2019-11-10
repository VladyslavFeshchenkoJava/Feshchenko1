package lesson18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(1, 1, 1, 1));
        list.add(new HeavyBox(1, 1, 1, 400));
        list.add(new HeavyBox(1, 1, 1, 3));
        list.add(new HeavyBox(1, 1, 1, 600));

        List<HeavyBox> tooHeavyBoxes = getTooHeavyBox(list);
        System.out.println(list);
        System.out.println(tooHeavyBoxes);
    }

    public static List<HeavyBox> getTooHeavyBox(List<HeavyBox> list) {
        List<HeavyBox> tooHeavyBoxes = new ArrayList<>();
        Iterator<HeavyBox> iterator = list.iterator();
        while (iterator.hasNext()) {
            HeavyBox box = iterator.next();
            if (box.weight > 300) {
                tooHeavyBoxes.add(box);
                iterator.remove();
            }
        }
        return tooHeavyBoxes;
    }
}
