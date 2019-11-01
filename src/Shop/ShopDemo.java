package Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopDemo {
    public static void main(String[] args) {

        Product bread = new Product("bread", "12UAH", "15", 1);
        Product milk = new Product("milk", "22 UAH", "14", 2);
        Product meet = new Product("meet", "100 UAH", "13", 3);

        Product pants = new Product("pants", "300 UAH", "5", 4);
        Product t_shirt = new Product("t-shirt", "150 UAH", "2", 5);
        Product coat = new Product("coat", "1000 UAH", "1", 6);

        Product tv = new Product("television", "12 000 UAH", "7", 7);
        Product computer = new Product("computer", "20000 UAH", "6", 8);
        Product smartphone = new Product("smartphone", "10000", "8", 9);

        Category food = new Category("food", new Product[]{bread, milk, meet});
        Category clothes = new Category("clothes", new Product[]{pants, t_shirt, coat});
        Category electronics = new Category("electronics", new Product[]{tv, computer, smartphone});

        Category[] categories = {food, clothes, electronics};
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("John Doe", "123456", new Basket(new ArrayList<>())));
        users.add(new User("AAAA", "12345", new Basket(new ArrayList<>())));


        Scanner scanner = new Scanner(System.in);
        User user = new User();
        user.authentication(scanner, users);
        Category category = new Category();
        category.viewCategories(scanner, categories);
    }
}
