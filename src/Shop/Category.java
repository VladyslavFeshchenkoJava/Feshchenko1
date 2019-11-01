package Shop;

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

    public void viewCategories(Scanner scanner, Category[] categories) {
        System.out.println("1 - categories of store, 0 - exit");
        while (true) {
            String operationEntered = scanner.nextLine();
            if (operationEntered.equals("1")) {
                System.out.println("Categories of our store: ");
                for (Category s : categories) {
                    System.out.println(s.name);
                }
                Product product = new Product();
                product.viewProducts(scanner,categories);
                break;
            } else if(operationEntered.equals("0")){
                break;
            }else {
                System.out.println("Enter '1' or '0'");
            }
        }
    }
}
