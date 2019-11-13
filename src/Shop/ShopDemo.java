package Shop;

import java.util.*;

public class ShopDemo {
    public static void main(String[] args) {

        Product bread = new Product("bred", "14", 12, "1", new Category());
        Product milk = new Product("milk", "14", 22, "2", new Category());
        Product meet = new Product("meet", "13", 100, "3", new Category());

        Map<String, Product> foodProducts = new TreeMap<>();
        foodProducts.put("1", bread);
        foodProducts.put("2", milk);
        foodProducts.put("3", meet);

        Product pants = new Product("pants", "5", 300, "1", new Category());
        Product t_shirt = new Product("t-shirt", "2", 150, "2", new Category());
        Product coat = new Product("coat", "1", 1000, "3", new Category());

        Map<String, Product> clothesProducts = new TreeMap<>();
        clothesProducts.put("1", pants);
        clothesProducts.put("2", t_shirt);
        clothesProducts.put("3", coat);

        Product tv = new Product("television", "7", 12000, "1", new Category());
        Product computer = new Product("computer", "9", 20000, "2", new Category());
        Product smartphone = new Product("smartphone", "8", 10000, "3", new Category());

        Map<String, Product> electronicsProducts = new TreeMap<>();
        electronicsProducts.put("1", tv);
        electronicsProducts.put("2", computer);
        electronicsProducts.put("3", smartphone);

        Category food = new Category("food", "1", foodProducts);
        Category clothes = new Category("clothes", "2", clothesProducts);
        Category electronics = new Category("electronics", "3", electronicsProducts);


        Category[] categories = {food, clothes, electronics};
        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();
        users.add(new User("John Doe", "123456", new Basket(new ArrayList<>())));
        users.add(new User("AAAA", "12345", new Basket(new ArrayList<>())));

        Category.viewCategories(scanner, categories, User.authentication(scanner, users));
    }
}
