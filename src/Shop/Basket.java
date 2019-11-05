package Shop;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basket {
    private List<Product> purchasedProducts;

    public Basket(List<Product> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public List<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(ArrayList<Product> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public static void addProductInBasket(Scanner scanner, Product[] products, List<Product> productsInBasket, User user) {
        first:
        while (true) {
            System.out.println();
            System.out.println("Enter which product you want add to basket");
            System.out.println("or press '0' to quite");
            String selectProduct = scanner.nextLine();
            for (Product p : products) {
                if (selectProduct.equals(p.getName())) {
                    productsInBasket.add(p);
                    System.out.println(p.getName() + " add in your basket");
                } else if (selectProduct.equals("0")) {
                    break first;
                }
            }
        }
        System.out.println();
        while (true) {
            System.out.println();
            System.out.println("Products in your basket");
            for (Product p : productsInBasket)
                System.out.println(p.getName() + "  " + NumberFormat.getCurrencyInstance().format(p.getPrice()));
            System.out.println();
            System.out.println("1-buy products");
            System.out.println("2-remove product from basket");
            System.out.println("0-back to categories");
            String operation = scanner.nextLine();
            if (operation.equals("1")) {
                buyProducts(productsInBasket, user);
            } else if (operation.equals("2")) {
                removeProduct(scanner, productsInBasket);
            } else if (operation.equals("0")) {
                break;
            } else {
                System.out.println("Invalid operation number");
            }
        }
        Basket basket = new Basket(productsInBasket);
        user.setBasket(basket);
    }

    public static void buyProducts(List<Product> productsInBasket, User user) {
        double sum = 0;
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy ");
        System.out.println();
        System.out.println("Bill for " + user.getLogin());
        System.out.printf("%14s %35s", "Date: ", dateTime.format(formatter));
        System.out.println();
        printHyphen();
        System.out.printf("%12s %15s %20s", "Category", "Product", "Prise");
        System.out.println();
        printHyphen();
        for (Product p : productsInBasket) {
            System.out.printf("%12s %15s %20s", p.getCategory(), p.getName(), NumberFormat.getCurrencyInstance().format(p.getPrice()));
            System.out.println();
            sum += p.getPrice();
        }
        printHyphen();
        System.out.printf("%13s %35s", "Total:", NumberFormat.getCurrencyInstance().format(sum));
        System.out.println();
        productsInBasket.clear();
    }

    public static void removeProduct(Scanner scanner, List<Product> productsInBasket) {
        System.out.println();
        System.out.println("Enter which product you want to remove");
        String productName = scanner.nextLine();
        int index = 0;
        for (Product p : productsInBasket) {
            if (productName.equals(p.getName())) {
                productsInBasket.remove(index);
                break;
            }
            index++;
        }
    }

    public static void printHyphen() {
        for (int i = 0; i < 60; i++)
            System.out.print("-");
        System.out.println();
    }
}

