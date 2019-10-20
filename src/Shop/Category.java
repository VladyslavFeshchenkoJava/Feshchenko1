package Shop;

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

    public static void viewCategories(Category[] categories) {
        System.out.println("Categories of our shop: ");
        for (Category s : categories) {

            System.out.println(s.name);
        }
    }
}
