package lesson8;

public class Reader {
    String fullName, faculty, birthDate, phoneNumber;
    int libraryCardNumber;

    public Reader(String fullName, String faculty, String birthDate, String phoneNumber, int libraryCardNumber) {
        this.fullName = fullName;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.libraryCardNumber = libraryCardNumber;
    }

    void takeBook(int numberOfBook) {

        System.out.println(fullName + " took " + numberOfBook + " books");
    }

    void takeBook(String... genreOfBook) {

        System.out.print(fullName + " took: ");
        for (String a : genreOfBook)
            System.out.print(a + " ");

        System.out.println();
    }

    void takeBook(Book... books) {

        System.out.print(fullName + " took: ");
        for (Book a : books)
            System.out.print(a.genreOfBook + " ");

        System.out.println();
    }

    void returnBook(int numberOfBookReturned) {

        System.out.println(fullName + " return " + numberOfBookReturned + " books");
    }

    void returnBook(String... genreOfBook) {

        System.out.print(fullName + " return: ");
        for (String a : genreOfBook)
            System.out.print(a + " ");

        System.out.println();
    }

    void returnBook(Book... books) {

        System.out.print(fullName + " return: ");
        for (Book a : books)
            System.out.print(a.genreOfBook + " ");

        System.out.println();
    }
}
