package lesson8;

public class Person {
    String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    void move() {

        System.out.println(fullName + " move");
    }

    void talk() {

        System.out.println(fullName + " talk");
    }
}
