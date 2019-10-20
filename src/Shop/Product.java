package Shop;

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

    public static void viewProducts(Category category) {
        Product[] products = category.getProducts();
        for (Product p : products) {

            System.out.println(p.name);
        }
    }
}
