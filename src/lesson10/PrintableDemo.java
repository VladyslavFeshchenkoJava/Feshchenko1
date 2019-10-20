package lesson10;

public class PrintableDemo {
    public static void main(String[] args) {

        Book book1 = new Book("NameOfBook1");
        Book book2 = new Book("NameOfBook2");
        Book book3 = new Book("NameOfBook3");

        Magazine magazine1 = new Magazine("Name Of Magazine1");
        Magazine magazine2 = new Magazine("Name Of Magazine2");
        Magazine magazine3 = new Magazine("Name Of Magazine3");

        Printable[] printable = {book1, book2, book3, magazine1, magazine2, magazine3};

        for (Printable p : printable) {

            p.print();
        }

        Magazine.printMagazines(printable);
        Book.printBooks(printable);
    }
}
