package Shop;

import lesson8.Person;

import java.text.NumberFormat;
import java.util.*;

public class Product implements Comparator<Product> {
    private String name, rating;
    private double price;
    private String id;
    private String categoryName;
    Category category;

    public Product(String name, String rating, double price, String id, Category category) {
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.id = id;
        this.category = category;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public int compare(Product o1, Product o2) {
        return 0;
    }

    public static void viewProducts(Scanner scanner, Category[] category, List<Product> productsInBasket, User user) {
        System.out.println();
        System.out.println("Select category:");
        System.out.println("1 - food; 2 - clothes; 3 - electronics; 0 - back");
        while (true) {
            String categoryEntered = scanner.nextLine();
            if (categoryEntered.equals("1")) {
                // printProducts(category[0]);
                sortedName(category[0]);
                Basket.addProductInBasket(scanner, category[0].getProducts(), productsInBasket, user);
                break;
            } else if (categoryEntered.equals("2")) {
                printProducts(category[1]);
                Basket.addProductInBasket(scanner, category[1].getProducts(), productsInBasket, user);
                break;
            } else if (categoryEntered.equals("3")) {
                printProducts(category[2]);
                Basket.addProductInBasket(scanner, category[2].getProducts(), productsInBasket, user);
                break;
            } else if (categoryEntered.equals("0")) {
                break;
            } else {
                System.out.println("Enter the correct operation number");
            }
        }
    }

    public static void printProducts(Category category) {
        Map<String, Product> products = category.getProducts();
        products.forEach((k, v) -> v.setCategoryName(category.getName()));
        System.out.println();
        products.forEach((k, v) -> System.out.println(v.getName() + " " + NumberFormat.getCurrencyInstance().format(v.getPrice())
                + " ID:" + v.getId()));
        System.out.println();
    }

    public static void sortedName(Category category) {
        Comparator<Product> comparator = Comparator.comparing(Product::getName).thenComparing(Product::getPrice);
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
