package lesson16;

public class User {
    private String login, password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
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

    public void createQuery() {
        class Query {
            public void print() {
                System.out.printf("User with login '%s' and password '%s' send query\n", login, password);
            }
        }

        Query query = new Query();
        query.print();
    }

    public static void main(String[] args) {
        User user = new User("login","12345");
        user.createQuery();
    }
}
