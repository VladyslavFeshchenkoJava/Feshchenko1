package lesson9;

public class ShapeDemo {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle("Blue", 5, 8, 2.2);
        shapes[1] = new Rectangle("Red", 9, 15, 15, 9);

        for (Shape shape : shapes) {
            shape.draw();
        }

        System.out.println(shapes[0].equals(shapes[1]));

        System.out.println(shapes[0]);
    }
}
