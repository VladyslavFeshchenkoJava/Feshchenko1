package Shop;

public class Basket {
    private Product[] purchasedProducts;

    public Basket(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public Product[] getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public static void productInBasket(Product[] products) {
        System.out.println("You added to Basket: ");
        for (Product p : products) {

            System.out.println(p.getName());
        }
    }

    public static void buyProducts(Product[] products) {
        double sum = 0;
        for (Product p : products) {

        }
    }
}
