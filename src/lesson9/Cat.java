package lesson9;

public class Cat extends Animal {
    private String catName;

    public Cat(String food, String location, String catName) {
        super(food, location);
        this.catName = catName;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public void makeNoise(){

        System.out.println("The cat says MAU!");
    }

    public void eat(){

        System.out.println("The cat eats mouses");
    }
}
