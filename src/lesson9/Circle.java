package lesson9;

import java.util.Objects;

public class Circle extends Shape {
    private int x, y;
    private double diameter;

    public Circle(String color, int x, int y, double diameter) {
        super(color);
        this.x = x;
        this.y = y;
        this.diameter = diameter;
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

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void draw() {

        System.out.println("Draw the circle with coordinates x:" + getX() + " y:" + getY() + " and Diameter:" + getDiameter() + " Color:" + getColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return x == circle.x &&
                y == circle.y &&
                Double.compare(circle.diameter, diameter) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y, diameter);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", diameter=" + diameter +
                "} " + super.toString();
    }
}
