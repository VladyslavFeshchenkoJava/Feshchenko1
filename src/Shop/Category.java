package Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Category {
    private String name;

    private Product[] products;

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public static void viewCategories(Scanner scanner, Category[] categories,User user) {
        List<Product> productsInBasket=new ArrayList<>();
        while (true) {
            System.out.println();
            System.out.println("1 - categories of store, 0 - exit");
            String operationEntered = scanner.nextLine();
            if (operationEntered.equals("1")) {
                System.out.println();
                System.out.println("Categories of our store: ");
                for (Category s : categories) {
                    System.out.println(s.name);
                }
                Product.viewProducts(scanner, categories,productsInBasket,user);
            } else if (operationEntered.equals("0")) {
                break;
            } else {
                System.out.println("Enter '1' or '0'");
            }
        }
    }
}
