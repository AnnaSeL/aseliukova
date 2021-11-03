package HWToLes13.Box;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateBox {
    public static void main(String[] args) {
        ArrayList<Box> boxes = new ArrayList<>();
        Box b1 = new Box(70, 40, 250, 300);
        boxes.add(b1);
        Box b2 = new Box(100, 70, 400, 630);
        boxes.add(b2);
        Box b3 = new Box(20, 37, 60, 215);
        boxes.add(b3);
        Box b4 = new Box(125, 30, 300, 450);
        boxes.add(b4);
        Box b5 = new Box(60, 170, 20, 320);
        boxes.add(b5);
        ArrayList<HeavyBox> heavyBoxes = Sort.sortList(boxes);
        System.out.println("Boxes: " + Arrays.toString(boxes.toArray()));
        System.out.println("Heavy boxes: " + Arrays.toString(heavyBoxes.toArray()));
    }
}
