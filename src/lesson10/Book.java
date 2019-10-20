package lesson10;

import java.util.Objects;

public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {

        System.out.println("Print book " + getName());
    }

    public static void print1(Printable[] printable) {

        for (Printable p : printable) {
            if (p instanceof Book)
                System.out.println(((Book) p).getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void printBooks(Printable[] printables) {

        for (Printable p : printables) {
            if (p instanceof Book)
                p.print();
        }
    }
}
