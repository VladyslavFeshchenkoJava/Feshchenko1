package Shop;

import java.text.NumberFormat;
import java.util.*;

public class Product {
    private String name, rating;
    private double price;
    private String id;
    private String categoryName;
    private Category category;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name) &&
                Objects.equals(rating, product.rating) &&
                Objects.equals(id, product.id) &&
                Objects.equals(categoryName, product.categoryName) &&
                Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating, price, id, categoryName, category);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", rating='" + rating + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", category=" + category +
                '}';
    }

    public static void viewProducts(Scanner scanner, Category[] categories, List<Product> productsInBasket, User user) {
        System.out.println();
        first:
        while (true) {
            System.out.println("Select category's ID or enter '0' for back");
            String categoryEntered = scanner.nextLine();
            for (Category c : categories) {
                if (c.getID().equals(categoryEntered)) {
                    printProducts(c, scanner);
                    Basket.addProductInBasket(scanner, c.getProducts(), productsInBasket, user);
                    break first;
                } else if (categoryEntered.equals("0")) {
                    break first;
                }
            }
            System.out.println("You entered invalid operation. Please enter the correct operation");
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
