package Shop;

import java.util.*;

public class Category {
    private String name, ID;

    private Map<String, Product> products;

    public Category(String name, String ID, Map<String, Product> products) {
        this.name = name;
        this.ID = ID;
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Map<String, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name) &&
                Objects.equals(products, category.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, products);
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }

    public static void viewCategories(Scanner scanner, List<Category> categories, User user) {
        List<Product> productsInBasket = new ArrayList<>();
        first:
        while (true) {
            System.out.println();
            System.out.println("Enter CATEGORY_LIST or EXIT");
            try {
                OperationsOfMainMenu operation = OperationsOfMainMenu.valueOf(scanner.nextLine());
                switch (operation) {
                    case CATEGORY_LIST: {
                        System.out.println();
                        System.out.println("Categories of our store: ");
                        for (Category category : categories) {
                            System.out.println(category.name + " -- ID: " + category.getID());
                        }
                        Product.viewProducts(scanner, categories, productsInBasket, user);
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
    }
}

