package lesson10;

public class Pear extends Fruit{
    private double priceForKilo;

    public Pear(double weight, double priceForKilo) {
        super(weight);
        this.priceForKilo = priceForKilo;
    }

    @Override
    public double priceOfFruit(double weight) {
        return weight*priceForKilo;
    }
}
