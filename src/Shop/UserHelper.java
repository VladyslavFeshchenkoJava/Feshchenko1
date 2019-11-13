package Shop;

import java.util.List;
import java.util.Scanner;

public class UserHelper {
    public static String correctNewLogin(Scanner scanner, List<User> users) {
        String newLogin;
        while (true) {
            System.out.println("Enter new login");
            newLogin = scanner.nextLine();
            try {
                for (User user : users) {
                    if (user.getLogin().equals(newLogin)) {
                        throw new WrongLoginException("User with this login already exist");
                    }
                }
                break;
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
            }
        }
        return newLogin;
    }

    public static String correctNewPassword(Scanner scanner) {
        String newPassword;
        String confirmPassword;
        while (true) {
            System.out.println("Enter new password");
            newPassword = scanner.nextLine();
            System.out.println("Confirm password");
            confirmPassword = scanner.nextLine();
            try {
                if (!newPassword.equals(confirmPassword)) {
                    throw new WrongPasswordException("Yore password and your confirm password do not match");
                }
                break;
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
        }
        return newPassword;
    }
}