package lesson12;

public class Pants extends Clothing implements MenClothing, WomenClothing {
    public Pants(ClothingSize clothingSize, double price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressAMan(Clothing clothing) {
        System.out.println("Men pents");
        System.out.println(clothing.color);
        System.out.println(clothing.price);
        System.out.println(clothing.clothingSize);
    }

    @Override
    public void dressAWoman(Clothing clothing) {
        System.out.println("Women pents");
        System.out.println(clothing.color);
        System.out.println(clothing.price);
        System.out.println(clothing.clothingSize);
    }
}
