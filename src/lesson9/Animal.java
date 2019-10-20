package lesson9;

public class Animal {
    private String food, location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise() {

        System.out.println("An Animal has a voice");
    }

    public void eat() {

        System.out.println("Every animals eat");
    }

    public void sleep() {

        System.out.println("An Animal sleeps");
    }
}
