package lesson9;

public class Dog extends Animal {
    private String dogName;

    public Dog(String food, String location, String dogName) {
        super(food, location);
        this.dogName = dogName;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void makeNoise() {

        System.out.println("The dog says WOF!");
    }

    public void eat() {

        System.out.println("The dog eats bones");
    }
}
