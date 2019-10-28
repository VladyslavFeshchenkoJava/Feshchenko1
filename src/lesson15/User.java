package lesson15;

public class User {
    private String login, password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
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

    class Query{
        public void printToLog(){
            System.out.println("User wis login "+login+" and password "+password+" sent a request");
        }
    }
}
