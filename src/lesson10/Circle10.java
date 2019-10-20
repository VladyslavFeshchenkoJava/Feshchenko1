package lesson10;

public class Circle10 {
    private double radius;
    public final double PI = 3.14;

    public Circle10(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(Circle10 circle) {
        return circle.radius * circle.radius * PI;
    }
}
