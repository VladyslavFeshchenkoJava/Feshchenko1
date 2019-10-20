package lesson9;

public class Horse extends Animal {
    private String horseName;

    public Horse(String food, String location, String horseName) {
        super(food, location);
        this.horseName = horseName;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    @Override
    public void makeNoise() {
        System.out.println("The horse saya IGOGO!");
    }

    @Override
    public void eat() {
        System.out.println("The horse eats apples");
    }
}
