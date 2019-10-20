package lesson10;

public class FlowerDemo {
    public static void main(String[] args) {
        Flower[] bouquet1 = {new Rose("Holland", 7, 40.0),
                new Rose("Holland", 7, 40),
                new Rose("Holland", 7, 45)};

        Flower[] bouquet2 = {new Clove("Ukraine", 4, 20.0),
                new Clove("Ukraine", 4, 20.0),
                new Rose("Holland", 7, 40.0)};

        Flower[] bouquet3 = {new Tulip("Turkey", 3, 15),
                new Tulip("Turkey", 3, 15),
                new Tulip("Turkey", 3, 15)};

        System.out.println("Prise of first bouquet is: " + Flower.priceOfBouquet(bouquet1));
        System.out.println("Prise of second bouquet is: " + Flower.priceOfBouquet(bouquet2));
        System.out.println("Prise of third bouquet is: " + Flower.priceOfBouquet(bouquet3));

        System.out.println("Count of flowers sold: " + Flower.count);
    }
}
