package Shop;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String login, password;
    private Basket basket;

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public void authentication(Scanner scanner, ArrayList<User> users) {
        first:
        while (true) {
            System.out.println("Enter your login");
            String loginEntered = scanner.nextLine();
            System.out.println("Enter your password");
            String passwordEntered = scanner.nextLine();
            for (User x : users) {
                if (loginEntered.equals(x.login) && passwordEntered.equals(x.password)) {
                    System.out.println("Welcome " );
                    break first;
                }
            }
            System.out.println("Do you want to register: 1 - Yes, 0 - No");
            String register=scanner.nextLine();
            if (register.equals("1")){
                users.add(registration(scanner,users));
                System.out.println("Welcome ");
                break first;
            }
        }

    }

    public static User registration(Scanner scanner, ArrayList<User> users){
        System.out.println("Enter login");
        String newLogin = scanner.nextLine();
        while (true) {
            System.out.println("Enter password");
            String newPassword = scanner.nextLine();
            System.out.println("Confirm the password");
            String confirmPassword=scanner.nextLine();
            if (newPassword.equals(confirmPassword)){
                return new User(newLogin,newPassword,new Basket(new Product[]{}));
            } else {
                System.out.println("Yore password and your confirm password do not match");
            }
        }
    }
}
