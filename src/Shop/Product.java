package Shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    private String name, rating;
    double price;
    private int id;

    public Product(String name, String rating, double price, int id) {
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.id = id;
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

    public static void viewProducts(Scanner scanner, Category[] category, ArrayList<Product> productsInBasket) {
        System.out.println("Select category:");
        System.out.println("1 - food; 2 - clothes; 3 - electronics; 0 - back");
        String categoryEntered = scanner.nextLine();
        while (true) {
            if (categoryEntered.equals("1")) {
                printProducts(category[0]);
                Basket.addProductInBasket(scanner, category[0].getProducts(),productsInBasket);
                break;
            } else if (categoryEntered.equals("2")) {
                printProducts(category[1]);
                Basket.addProductInBasket(scanner, category[1].getProducts(),productsInBasket);
                break;
            } else if (categoryEntered.equals("3")) {
                printProducts(category[2]);
                Basket.addProductInBasket(scanner, category[2].getProducts(),productsInBasket);
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
        for (
                Product p : products) {

            System.out.println(p.name + " " + p.price);
        }
    }
}
