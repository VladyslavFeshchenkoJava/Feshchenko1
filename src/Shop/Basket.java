package Shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Basket {
    private ArrayList<Product> purchasedProducts;

    public Basket(ArrayList<Product> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public ArrayList<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(ArrayList<Product> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public static ArrayList<Product> addProductInBasket(Scanner scanner, Product[] products, ArrayList<Product> productsInBasket) {
        first:
        while (true) {
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
            System.out.println("Products in your basket");
            for (Product p : productsInBasket)
                System.out.println(p.getName() + "  " + p.getPrice() + " UAH");
            System.out.println();
            System.out.println("1-buy products");
            System.out.println("2-remove product from basket");
            System.out.println("0-back to categories");
            String operation = scanner.nextLine();
            if (operation.equals("1")) {
                buyProducts(productsInBasket);
            } else if (operation.equals("2")) {
                removeProduct(scanner, productsInBasket);
            } else if (operation.equals("0")) {
                break;
            } else {
                System.out.println("Invalid operation number");
            }
        }
        return productsInBasket;
    }

    public static void buyProducts(ArrayList<Product> productsInBasket) {
        double sum = 0;
        for (Product p : productsInBasket) {
            sum += p.getPrice();
        }
        System.out.println(sum);
        productsInBasket.clear();
    }

    public static void removeProduct(Scanner scanner, ArrayList<Product> productsInBasket) {
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
}

