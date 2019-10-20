package lesson10;

import java.util.Objects;

public class Flower {
    private String countryOfManufacture;
    private int shelfLife;
    private double price;

    static int count=0;

    public Flower(String countryOfManufacture, int shelfLife, double price) {
        this.countryOfManufacture = countryOfManufacture;
        this.shelfLife = shelfLife;
        this.price = price;
    }

    public Flower() {
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return shelfLife == flower.shelfLife &&
                Double.compare(flower.price, price) == 0 &&
                countryOfManufacture.equals(flower.countryOfManufacture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryOfManufacture, shelfLife, price);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "countryOfManufacture='" + countryOfManufacture + '\'' +
                ", shelfLife=" + shelfLife +
                ", price=" + price +
                '}';
    }

    public static double priceOfBouquet(Flower[] bouquet){
        double sum=0;
        for (Flower b:bouquet){
            sum+=b.price;
            count++;
        }
        return sum;
    }
}
