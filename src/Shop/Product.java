package Shop;

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
                printProducts(category[0], scanner);
                Basket.addProductInBasket(scanner, category[0].getProducts(), productsInBasket, user);
                break;
            } else if (categoryEntered.equals("2")) {
                printProducts(category[1], scanner);
                Basket.addProductInBasket(scanner, category[1].getProducts(), productsInBasket, user);
                break;
            } else if (categoryEntered.equals("3")) {
                printProducts(category[2], scanner);
                Basket.addProductInBasket(scanner, category[2].getProducts(), productsInBasket, user);
                break;
            } else if (categoryEntered.equals("0")) {
                break;
            } else {
                System.out.println("Enter the correct operation number");
            }
        }
    }

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
