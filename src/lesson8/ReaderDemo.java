package lesson8;

public class ReaderDemo {
    public static void main(String[] args) {

        Reader reader1 = new Reader("John Smith", "Math", "10.03.1999", "+380672222222", 100);
        Reader reader2 = new Reader("Jack Daniels", "Philosophy", "10.02.1866", "1-888-551-jack", 101);
        Reader reader3 = new Reader("John Woo", "Cinema", "01.05.1941", "+8615026861779", 102);

        Book book1 = new Book("Scientific", "D.E.Knut");
        Book book2 = new Book("Novel", "Jane Austen");
        Book book3 = new Book("Science fiction", "Herbert Wells");
        Book book4 = new Book("Adventure", "Mayne Reid");
        Book book5 = new Book("Detective", "Agatha Christie");

        reader1.takeBook(2);
        reader1.takeBook("Scientific", "Novel");
        reader1.takeBook(book1, book2);

        reader2.returnBook(3);
        reader2.returnBook("Science fiction", "Adventure", "Detective");
        reader2.returnBook(book3, book4, book5);
    }
}
