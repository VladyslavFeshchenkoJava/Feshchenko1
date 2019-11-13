package Shop;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(purchasedProducts, basket.purchasedProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchasedProducts);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "purchasedProducts=" + purchasedProducts +
                '}';
    }

    public static void addProductInBasket(Scanner scanner, Map<String, Product> products, List<Product> productsInBasket, User user) {
        first:
        while (true) {
            System.out.println();
            System.out.println("Enter ID of product which you want add to basket");
            System.out.println("or press '0' to quite");
            String selectProduct = scanner.nextLine();
            Set<String> keys = products.keySet();
            for (String key : keys) {
                if (selectProduct.equals(key)) {
                    productsInBasket.add(products.get(key));
                    System.out.println(products.get(key).getName() + " add in your basket");
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
        System.out.printf("%14s %35s \n", "Date: ", dateTime.format(formatter));
        printHyphen();
        System.out.printf("%12s %15s %20s \n", "Category", "Product", "Prise");
        printHyphen();
        for (Product p : productsInBasket) {
            System.out.printf("%12s %15s %20s \n", p.getCategoryName(), p.getName(), NumberFormat.getCurrencyInstance().format(p.getPrice()));
            sum += p.getPrice();
        }
        printHyphen();
        System.out.printf("%13s %35s", "Total:", NumberFormat.getCurrencyInstance().format(sum));
        System.out.println();
        writeToFile(productsInBasket, user);
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

    public static void writeToFile(List<Product> productsInBasket, User user) {
        try (PrintWriter printWriter = new PrintWriter("report.txt")) {
            double sum = 0;
            LocalDateTime dateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy ");
            printWriter.printf("%14s %35s \n", "Date: ", dateTime.format(formatter));
            printWriter.println("User " + user.getLogin() + " buy:");
            for (Product p : productsInBasket) {
                printWriter.printf("%12s %15s %20s \n", p.getCategoryName(), p.getName(),
                        NumberFormat.getCurrencyInstance().format(p.getPrice()));
                sum += p.getPrice();
            }
            printWriter.printf("%13s %35s", "Total:", NumberFormat.getCurrencyInstance().format(sum));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

