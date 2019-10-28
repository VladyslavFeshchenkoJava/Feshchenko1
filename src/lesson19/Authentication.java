package lesson19;

public class Authentication {
    public static void main(String[] args) {
        System.out.println(verify("login", "12345", "12345"));
        System.out.println();
        System.out.println(verify("login", "123456", "1234"));
        System.out.println();
        System.out.println(verify("loginnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn",
                "123456", "1234"));
    }

    public static boolean verify(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 10) {
                throw new WrongLoginException("Too long login");
            }
            if (password.length() > 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Wrong password");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        finally {
            System.out.printf("Login : %s, password %s \n",login,password);
        }
        return true;
    }
}
