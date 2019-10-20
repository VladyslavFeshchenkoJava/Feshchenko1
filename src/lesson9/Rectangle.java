package lesson9;

import java.util.Objects;

public class Rectangle extends Shape {
    int x, y, x1, y1;

    public Rectangle(String color, int x, int y, int x1, int y1) {
        super(color);
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    @Override
    public void draw() {

        System.out.println("Draw rectangle with coordinates x:" + getX() + " y:" + getY() + " x1:" + getX1() + " y1:" + getY1() + " Color:" + getColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return x == rectangle.x &&
                y == rectangle.y &&
                x1 == rectangle.x1 &&
                y1 == rectangle.y1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y, x1, y1);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", x1=" + x1 +
                ", y1=" + y1 +
                "} " + super.toString();
    }
}
