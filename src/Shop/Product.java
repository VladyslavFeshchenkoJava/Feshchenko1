package Shop;

import java.util.*;

public class Product {
    private String name, rating;
    private double price;
    private String id;
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
                Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating, price, id, category);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", rating='" + rating + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                ", category=" + category.getName() +
                '}';
    }

    public static void viewProducts(Scanner scanner, Category[] categories, List<Product> productsInBasket, User user) {
        System.out.println();
        first:
        while (true) {
            System.out.println("Select category's ID or enter '0' for back");
            String categoryEntered = scanner.nextLine();
            for (Category category : categories) {
                if (category.getID().equals(categoryEntered)) {
                    ProductHelper.printProducts(category, scanner);
                    Basket.basketOperations(scanner, category.getProducts(), productsInBasket, user);
                    break first;
                } else if (categoryEntered.equals("0")) {
                    break first;
                }
            }
            System.out.println("You entered invalid operation. Please enter the correct operation");
        }
    }
}
