package lesson12;

public class Skirt extends Clothing implements WomenClothing {
    public Skirt(ClothingSize clothingSize, double price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressAWoman(Clothing clothing) {
        System.out.println("Women skirt");
        System.out.println(clothing.color);
        System.out.println(clothing.price);
        System.out.println(clothing.clothingSize);
    }
}
