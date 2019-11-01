package Shop;

import lesson9.Cat;

import java.util.Scanner;

public class Product {
    private String name, price, rating;
    private int id;

    public Product(String name, String price, String rating, int id) {
        this.name = name;
        this.price = price;
        this.rating = rating;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
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

    public void viewProducts(Scanner scanner, Category[] category) {
        System.out.println("Select category:");
        System.out.println("1 - food; 2 - clothes; 3 - electronics; 0 - exit");
        String categoryEntered = scanner.nextLine();
        while (true) {
            if (categoryEntered.equals("1")) {
                printProducts(category[0]);
                break;
            } else if (categoryEntered.equals("2")) {
                printProducts(category[1]);
                break;
            } else if (categoryEntered.equals("3")) {
                printProducts(category[2]);
                break;
            }else if (categoryEntered.equals("0")){
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

            System.out.println(p.name);
        }
    }
}
