package Shop;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    private String name, rating;
    private double price;
    private int id;
    private String category;

    public Product(String name, String rating, double price, int id, Category category) {
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.id = id;
        this.category = category.getName();
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static void viewProducts(Scanner scanner, Category[] category, List<Product> productsInBasket, User user) {
        System.out.println();
        System.out.println("Select category:");
        System.out.println("1 - food; 2 - clothes; 3 - electronics; 0 - back");
        while (true) {
            String categoryEntered = scanner.nextLine();
            if (categoryEntered.equals("1")) {
                printProducts(category[0]);
                Basket.addProductInBasket(scanner, category[0].getProducts(), productsInBasket,user);
                break;
            } else if (categoryEntered.equals("2")) {
                printProducts(category[1]);
                Basket.addProductInBasket(scanner, category[1].getProducts(), productsInBasket,user);
                break;
            } else if (categoryEntered.equals("3")) {
                printProducts(category[2]);
                Basket.addProductInBasket(scanner, category[2].getProducts(), productsInBasket,user);
                break;
            } else if (categoryEntered.equals("0")) {
                break;
            } else {
                System.out.println("Enter the correct operation number");
            }
        }
    }

    public static void printProducts(Category category) {
        Product[] products = category.getProducts();
        System.out.println();
        for (Product p : products) {
            p.category = category.getName();
            System.out.println(p.name + " " + NumberFormat.getCurrencyInstance().format(p.getPrice()));
        }
        System.out.println();
    }
}
