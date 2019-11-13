package Shop;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BasketHelper {
    public static void addProductInBasket(Scanner scanner, Map<String, Product> products, List<Product> productsInBasket) {
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
    }

    public static List<Product> operationsWithBasket(Scanner scanner, List<Product> productsInBasket, User user) {
        first:
        while (true) {
            System.out.println();
            System.out.println("Products in your basket:");
            for (Product product : productsInBasket) {
                System.out.println(product.getName() + "  " + NumberFormat.getCurrencyInstance().format(product.getPrice()));
            }
            System.out.println();
            System.out.println("If you want to buy products from your basket enter 'BUY'");
            System.out.println("If you want to remove product from your basket enter 'REMOVE'");
            System.out.println("If you want to go to main menu enter 'EXIT'");
            try {
                OperationsOfBasketMenu operation = OperationsOfBasketMenu.valueOf(scanner.nextLine());
                switch (operation) {
                    case BUY: {
                        BasketHelper.buyProducts(productsInBasket, user);
                        break;
                    }
                    case REMOVE: {
                        BasketHelper.removeProduct(scanner, productsInBasket);
                        break;
                    }
                    case EXIT: {
                        break first;
                    }
                }
            } catch (IllegalArgumentException e) {
                System.out.println("You entered invalid operation");
            }
        }
        return productsInBasket;
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
