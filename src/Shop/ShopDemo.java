package Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopDemo {
    public static void main(String[] args) {

        Product bread = new Product("bread", "15", 12.0, 1, new Category());
        Product milk = new Product("milk", "14", 22, 2,new Category());
        Product meet = new Product("meet", "13", 100, 3,new Category());

        Product pants = new Product("pants", "5", 300, 4,new Category());
        Product t_shirt = new Product("t-shirt", "2", 150, 5,new Category());
        Product coat = new Product("coat", "1", 1000, 6,new Category());

        Product tv = new Product("television", "7", 12000, 7,new Category());
        Product computer = new Product("computer", "9", 20000, 8,new Category());
        Product smartphone = new Product("smartphone", "8", 10000, 9,new Category());

        Category food = new Category("food", new Product[]{bread, milk, meet});
        Category clothes = new Category("clothes", new Product[]{pants, t_shirt, coat});
        Category electronics = new Category("electronics", new Product[]{tv, computer, smartphone});

        Category[] categories = {food, clothes, electronics};
        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();
        users.add(new User("John Doe", "123456", new Basket(new ArrayList<>())));
        users.add(new User("AAAA", "12345", new Basket(new ArrayList<>())));


        Category.viewCategories(scanner, categories,User.authentication(scanner,users));


    }
}
