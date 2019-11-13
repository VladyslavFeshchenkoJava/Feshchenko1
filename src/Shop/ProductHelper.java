package Shop;

import java.text.NumberFormat;
import java.util.*;

public class ProductHelper {
    public static void printProducts(Category category, Scanner scanner) {
        Comparator<Product> sortRating = Comparator.comparing(Product::getRating).thenComparing(Product::getName).reversed();
        Comparator<Product> sortName = Comparator.comparing(Product::getName).thenComparing(Product::getPrice);
        Comparator<Product> sortPriceUp = Comparator.comparing(Product::getPrice).thenComparing(Product::getName);
        Comparator<Product> sortPriceDown = Comparator.comparing(Product::getPrice).thenComparing(Product::getName).reversed();
        sort(sortRating, category);
        System.out.println("Sort:");
        System.out.println("1 - by price ascending; 2 - by price descending; 3 - by Name");
        System.out.println("0 - leave sort by rating");
        while (true) {
            String sortEntering = scanner.nextLine();
            if (sortEntering.equals("1")) {
                sort(sortPriceUp, category);
                break;
            } else if (sortEntering.equals("2")) {
                sort(sortPriceDown, category);
                break;
            } else if (sortEntering.equals("3")) {
                sort(sortName, category);
                break;
            } else if (sortEntering.equals("0")) {
                break;
            } else {
                System.out.println("Enter the correct operation number ");
            }
        }
    }

    public static void sort(Comparator<Product> comparator, Category category) {
        SortedSet<Product> set = new TreeSet<>(comparator);
        Map<String, Product> productMap = new HashMap<>();
        productMap.putAll(category.getProducts());
        Set<String> keys = productMap.keySet();
        for (String key : keys) {
            productMap.get(key).setCategoryName(category.getName());
            set.add(productMap.get(key));
        }
        set.forEach(v -> System.out.println(v.getName() + " " + NumberFormat.getCurrencyInstance().format(v.getPrice()) + " ID:" +
                v.getId()));
    }
}
