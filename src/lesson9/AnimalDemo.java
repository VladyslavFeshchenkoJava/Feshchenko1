package lesson9;

public class AnimalDemo {
    public static void main(String[] args) {

        Animal[] animals = {new Dog("bones", "in yard", "Butch"),
                new Cat("mouses", "on sofa", "TIM"),
                new Horse("Apples", "stable", "Lu-Lu")};

        for (Animal animal : animals) {

            animal.eat();
            animal.makeNoise();
        }
    }
}
