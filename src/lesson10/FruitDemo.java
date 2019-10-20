package lesson10;

public class FruitDemo {
    public static void main(String[] args) {
        Apple apple1 = new Apple(0.3, 16.0);
        Apple apple2 = new Apple(0.6, 12.0);
        Apple apple3 = new Apple(0.8, 15.0);

        Pear pear1 = new Pear(0.5, 40);
        Pear pear2 = new Pear(0.6, 35.0);
        Pear pear3 = new Pear(0.3, 30.0);

        Apricot apricot1 = new Apricot(0.8, 40.0);
        Apricot apricot2 = new Apricot(0.5, 50);
        Apricot apricot3 = new Apricot(1.2, 60.0);

        Apple[] apples = {apple1, apple2, apple3};
        Apricot[] apricots = {apricot1, apricot2, apricot3};
        Pear[] pears = {pear1, pear2, pear3};

        Fruit[][] fruits1 = {apples, apricots, pears};

        double totalSum = 0;

        for (int i = 0; i < fruits1.length; i++) {
            double sumForFruits = 0;
            for (Fruit f : fruits1[i])
                sumForFruits = sumForFruits + f.priceOfFruit(f.weight);

            totalSum += sumForFruits;
            System.out.println(sumForFruits);
        }
        System.out.println(totalSum);
    }
}
