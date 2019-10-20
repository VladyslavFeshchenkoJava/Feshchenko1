package lesson10;

import java.util.Objects;

public class Magazine implements Printable {
    private String nameOfMagazine;

    public Magazine(String nameOfMagazine) {
        this.nameOfMagazine = nameOfMagazine;
    }

    public String getNameOfMagazine() {
        return nameOfMagazine;
    }

    public void setNameOfMagazine(String nameOfMagazine) {
        this.nameOfMagazine = nameOfMagazine;
    }

    @Override
    public void print() {

        System.out.println("Print magazine " + getNameOfMagazine());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return nameOfMagazine.equals(magazine.nameOfMagazine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfMagazine);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "nameOfMagazine='" + nameOfMagazine + '\'' +
                '}';
    }

    public static void printMagazines(Printable[] printables) {

        for (Printable p : printables) {
            if (p instanceof Magazine)
                p.print();
        }
    }
}
