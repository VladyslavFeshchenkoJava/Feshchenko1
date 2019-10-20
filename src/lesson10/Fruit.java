package lesson10;

public abstract class Fruit {
    double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public void printManufacturerInfo() {
        System.out.println("Made in Ukraine");
    }

    public abstract double priceOfFruit(double weight);
}
