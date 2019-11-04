package Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopDemo {
    public static void main(String[] args) {

        Product bread = new Product("bread", "15", 12.0, 1);
        Product milk = new Product("milk", "14", 22, 2);
        Product meet = new Product("meet", "13", 100, 3);

        Product pants = new Product("pants", "5", 300, 4);
        Product t_shirt = new Product("t-shirt", "2", 150, 5);
        Product coat = new Product("coat", "1", 1000, 6);

        Product tv = new Product("television", "7", 12000, 7);
        Product computer = new Product("computer", "9", 20000, 8);
        Product smartphone = new Product("smartphone", "8", 10000, 9);

        Category food = new Category("food", new Product[]{bread, milk, meet});
        Category clothes = new Category("clothes", new Product[]{pants, t_shirt, coat});
        Category electronics = new Category("electronics", new Product[]{tv, computer, smartphone});

        Category[] categories = {food, clothes, electronics};
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("John Doe", "123456", new Basket(new ArrayList<Product>())));
        users.add(new User("AAAA", "12345", new Basket(new ArrayList<Product>())));


        Scanner scanner = new Scanner(System.in);
        User.authentication(scanner, users);
        Category.viewCategories(scanner, categories);

    }
}
