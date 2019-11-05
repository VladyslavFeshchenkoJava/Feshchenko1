package lesson18;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public Box() {
        width = -1;  // используем -1 для
        height = -1; // обозначения непроинициализированной
        depth = -1;  // коробки
    }

    Box(double len) {
        width = len;
        height = len;
        depth = len;
    }

    double getVolume() {
        return width * height * depth;
    }
}
