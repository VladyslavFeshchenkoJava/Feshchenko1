package lesson8;

public class Phone {
    static int count;
    private String number, model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this();
        this.number = number;
        this.model = model;
    }

    public Phone() {

        count++;
    }

    public String getNumber() {

        return number;
    }

    public void setNumber(String number) {

        this.number = number;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    void reseiveCall(String name) {

        System.out.println("Calling: " + name);
    }

    void reseiveCall(String name, String number) {

        System.out.println("Current number " + this.number);
        System.out.println("Calling: " + name + " " + number);
    }

    void sendMassage(String text, String... array) {

        System.out.println("Text: " + text);

        for (String a : array) {

            System.out.println("Send to: " + a);
        }
    }
}
