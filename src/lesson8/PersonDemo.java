package lesson8;

public class PersonDemo {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2=new Person("Smith",52);

        person1.move();
        person2.talk();
    }
}
