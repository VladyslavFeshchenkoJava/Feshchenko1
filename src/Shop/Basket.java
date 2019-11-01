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

    public static ArrayList<Product> addProductToBasket(Scanner scanner, Product[] products) {
        while (true) {
            System.out.println("Enter which product you want add to basket");
            System.out.println("or press '0' to quite");
            String selectProduct = scanner.nextLine();
            for (Product p:products){

            }
        }
    }

    public static void buyProducts(Product[] products) {
        double sum = 0;
        for (Product p : products) {

        }
    }
}
