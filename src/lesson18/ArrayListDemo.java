package lesson18;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();

        list.add(new HeavyBox(1,1,1,1));
        list.add(new HeavyBox(23,23,23,23));
        list.add(new HeavyBox(2,2,2,2));
        System.out.println(list);
        for (HeavyBox box:list){
            System.out.println(box.weight);
        }

        list.forEach(box->System.out.println(box.weight));

        HeavyBox box1=list.get(1);
        box1.weight+=1;

        list.forEach(b-> System.out.println(b.weight));

        list.remove(list.size()-1);

        list.forEach(b-> System.out.println(b.weight));

        HeavyBox[] heavyBoxes = new HeavyBox[list.size()];
        list.toArray(heavyBoxes);

        for (HeavyBox x:heavyBoxes){
            System.out.println(x);
        }

        list.clear();

        list.forEach(b-> System.out.println(b.weight));
    }
}
