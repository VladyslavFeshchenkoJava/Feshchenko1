package lesson18;

public class HeavyBox extends Box implements Comparable<HeavyBox>{
    public int weight;

    public HeavyBox(int width, int height, int depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }

    public HeavyBox() {
        this.weight = -1;
    }

    @Override
    public int compareTo(HeavyBox o) {
        return this.weight-o.weight;
    }
}
