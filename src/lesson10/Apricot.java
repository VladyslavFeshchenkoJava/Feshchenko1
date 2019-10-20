package lesson10;

public class Apricot extends Fruit {
    private double priceForKilo;

    public Apricot(double weight, double priceForKilo) {
        super(weight);
        this.priceForKilo = priceForKilo;
    }

    @Override
    public double priceOfFruit(double weight) {
        return weight * priceForKilo;
    }
}
