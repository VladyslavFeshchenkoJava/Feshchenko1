package lesson10;

public class Apple extends Fruit {
    private double priceForKilo;

    public Apple(double weight, double priceForKilo) {
        super(weight);
        this.priceForKilo = priceForKilo;
    }

    @Override
    public double priceOfFruit(double weight) {
        return weight * priceForKilo;
    }
}
