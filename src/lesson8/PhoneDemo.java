package lesson8;

public class PhoneDemo {
    public static void main(String[] args) {

        Phone phone1 = new Phone("+380-50-111-11-11","Sumsung A10", 600);
        Phone phone2 = new Phone("+380-67-222-22-22","Sumsung J10");
        Phone phone3 = new Phone();

        phone2.setWeight(700);

        phone3.setModel("Iphone.10");
        phone3.setNumber("+380-63-333-33-33");
        phone3.setWeight(700);

        phone1.reseiveCall("Mom");
        phone1.reseiveCall("Dad","+380-50-444-44-44");
        phone1.reseiveCall("Sister");

        System.out.println(phone1.getNumber());

        System.out.println("Phone1: " + phone1.getModel() + "; " + phone1.getNumber() + "; " + phone1.getWeight());
        System.out.println("Phone2: " + phone2.getModel() + "; " + phone2.getNumber() + "; " + phone2.getWeight());
        System.out.println("Phone3: " + phone3.getModel() + "; " + phone3.getNumber() + "; " + phone3.getWeight());

        phone1.sendMassage("Hello","+380-50-555-55-55","+380-67-666-66-66","+380-63-777-77-77");

        System.out.println(Phone.count);
    }
}
