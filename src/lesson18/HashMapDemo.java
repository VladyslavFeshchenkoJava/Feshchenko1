package lesson18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Product> map = new HashMap();

        map.put("Doll",new Product("Doll",450,"Ukraine"));
        map.put("Box",new Product("Box",150,"Ukraine"));
        map.put("Car",new Product("Car",500,"Ukraine"));
        System.out.println(map.size());

        Set<String> keys = map.keySet();
        keys.forEach(k->System.out.println(map.get(k)));

        Collection<Product> collection=map.values();
        collection.forEach(System.out::println);

        Set<Map.Entry<String,Product>> entries = map.entrySet();
        entries.forEach(e-> System.out.println(e.getKey()+":"+e.getValue()));
    }
}
