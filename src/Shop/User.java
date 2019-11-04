package Shop;

import java.util.ArrayList;
import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return login.equals(user.login) &&
                password.equals(user.password) &&
                basket.equals(user.basket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, basket);
    }

    public static void authentication(Scanner scanner, ArrayList<User> users) {
        System.out.println("If you have account press '1'");
        System.out.println("If you want to register press '0'");
        String selected = scanner.nextLine();
        if (selected.equals("1")) {
            first:
            while (true) {
                System.out.println("Enter your login");
                String loginEntered = scanner.nextLine();
                System.out.println("Enter your password");
                String passwordEntered = scanner.nextLine();
                for (User x : users) {
                    if (loginEntered.equals(x.login) && passwordEntered.equals(x.password)) {
                        System.out.println();
                        System.out.println("Welcome ");
                        break first;
                    }
                }
                System.out.println("Wrong login or password");
                System.out.println("Do you want to register: 1 - Yes, 0 - No");
                String register = scanner.nextLine();
                if (register.equals("1")) {
                    users.add(registration(scanner, users));
                    System.out.println("Welcome ");
                    break;
                }
            }
        }
        if (selected.equals("0")) {
            users.add(registration(scanner, users));
        }
    }

    public static User registration(Scanner scanner, ArrayList<User> users) {
        String newLogin;
        boolean correctLogin;
        second:
        do {
            correctLogin = false;
            System.out.println("Enter login");
            newLogin = scanner.nextLine();
            for (User u : users) {
                if (u.login.equals(newLogin)) {
                    System.out.println("User with this login already exist");
                    correctLogin = true;
                }
            }
        } while (correctLogin);

        while (true) {
            System.out.println("Enter password");
            String newPassword = scanner.nextLine();
            System.out.println("Confirm the password");
            String confirmPassword = scanner.nextLine();
            if (newPassword.equals(confirmPassword)) {
                return new User(newLogin, newPassword, new Basket(new ArrayList<Product>()));
            } else {
                System.out.println("Yore password and your confirm password do not match");
            }
        }
    }
}
