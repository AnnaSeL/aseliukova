package HWToLes13.Box;

public class Box extends HeavyBox{

    public Box(int length, int depth, int width, int weight) {
        super(length, depth, width, weight);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", depth=" + depth +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }
}

