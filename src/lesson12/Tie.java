package lesson12;

public class Tie extends Clothing implements MenClothing {
    public Tie(ClothingSize clothingSize, double price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressAMan(Clothing clothing) {
        System.out.println("Man's tie");
        System.out.println(clothing.color);
        System.out.println(clothing.price);
        System.out.println(clothing.clothingSize);
    }
}
