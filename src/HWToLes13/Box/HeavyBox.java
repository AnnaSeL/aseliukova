package HWToLes13.Box;

import java.util.Objects;

public class HeavyBox {
    int length;
    int depth;
    int width;
    int weight;

    public int getWeight() {
        return weight;
    }

    public HeavyBox(int length, int depth, int width, int weight) {
        this.length = length;
        this.depth = depth;
        this.width = width;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavyBox box = (HeavyBox) o;
        return length == box.length && depth == box.depth && width == box.width && weight == box.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, depth, width, weight);
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "length=" + length +
                ", depth=" + depth +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }
}
