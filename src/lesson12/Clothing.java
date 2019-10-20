package lesson12;

public abstract class Clothing {
    ClothingSize clothingSize;
    double price;
    String color;

    public Clothing(ClothingSize clothingSize, double price, String color) {
        this.clothingSize = clothingSize;
        this.price = price;
        this.color = color;
    }
}
