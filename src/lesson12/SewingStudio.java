package lesson12;

public class SewingStudio {
    public static void main(String[] args) {
        Clothing[] clothing = {new Pants(ClothingSize.S, 250.0, "yellow"),
                new Skirt(ClothingSize.M, 250.0, "brown"),
                new T_shirt(ClothingSize.L, 150.0, "white"),
                new Tie(ClothingSize.M, 100.0, "black")};

        for (Clothing c : clothing) {
            if (c instanceof MenClothing && c instanceof WomenClothing) {
                ((MenClothing) c).dressAMan(c);
                ((WomenClothing) c).dressAWoman(c);
            } else if (c instanceof WomenClothing && !(c instanceof MenClothing)) {
                ((WomenClothing) c).dressAWoman(c);
            } else if (c instanceof MenClothing && !(c instanceof WomenClothing)) {
                ((MenClothing) c).dressAMan(c);
            }
        }
    }
}
