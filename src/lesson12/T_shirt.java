package lesson12;

public class T_shirt extends Clothing implements MenClothing, WomenClothing  {
    public T_shirt(ClothingSize clothingSize, double price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressAMan(Clothing clothing) {
        System.out.println("Man's t-shirt");
        System.out.println(clothing.color);
        System.out.println(clothing.price);
        System.out.println(clothing.clothingSize);
    }

    @Override
    public void dressAWoman(Clothing clothing) {
        System.out.println("Woman's t-shirt");
        System.out.println(clothing.color);
        System.out.println(clothing.price);
        System.out.println(clothing.clothingSize);
    }
}
