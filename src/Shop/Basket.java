package Shop;

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

    public static void basketOperations(Scanner scanner, Map<String, Product> products, List<Product> productsInBasket, User user) {
        BasketHelper.addProductInBasket(scanner, products, productsInBasket);
        System.out.println();
        Basket basket = new Basket(BasketHelper.operationsWithBasket(scanner, productsInBasket, user));
        user.setBasket(basket);
    }
}

