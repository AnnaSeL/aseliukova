package HWToLes13.Box;

import java.util.ArrayList;
import java.util.Iterator;

public class Sort {
    public static ArrayList<HeavyBox> sortList(ArrayList<Box> boxes){
        ArrayList<HeavyBox> heavyBoxes = new ArrayList<>();
        Iterator<Box> iterator = boxes.iterator();
        while (iterator.hasNext()){
            Box thisBox = iterator.next();
            if(thisBox.getWeight() > 300){
                heavyBoxes.add(thisBox);
                iterator.remove();
            }
        }
        return heavyBoxes;
    }
}
