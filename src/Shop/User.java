package Shop;

import java.util.ArrayList;
import java.util.List;
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

    public static User authentication(Scanner scanner, List<User> users) {
        User newUser = new User();
        System.out.println("If you have account press '1'");
        System.out.println("If you want to register press '0'");
        second:
        while (true) {
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
                            newUser = x;
                            break first;
                        }
                    }
                    System.out.println("Wrong login or password");
                    while (true) {
                        System.out.println("Do you want to register: 1 - Yes, 0 - No");
                        String register = scanner.nextLine();
                        if (register.equals("1")) {
                            newUser = registration(scanner, users);
                            users.add(newUser);
                            System.out.println("Welcome");
                            break first;
                        } else if (!register.equals("0")) {
                            System.out.println("Please enter '1' or '0'");
                        } else break;
                    }
                }
                break second;
            } else if (selected.equals("0")) {
                newUser = registration(scanner, users);
                System.out.println("Welcome");
                users.add(newUser);
                break second;
            } else {
                System.out.println("Enter '1' or '0'");
            }
        }
        return newUser;
    }

    public static User registration(Scanner scanner, List<User> users) {
        String newLogin;
        boolean correctLogin;
        second:
        do {
            correctLogin = false;
            System.out.println("Enter new login");
            newLogin = scanner.nextLine();
            for (User u : users) {
                if (u.login.equals(newLogin)) {
                    System.out.println("User with this login already exist");
                    correctLogin = true;
                }
            }
        } while (correctLogin);

        while (true) {
            System.out.println("Enter new password");
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
