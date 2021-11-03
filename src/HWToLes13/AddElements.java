package HWToLes13;

import java.util.ArrayList;
import java.util.LinkedList;

public class AddElements {
    ArrayList<Integer> elementsArrayList = new ArrayList<>();
    LinkedList<Integer> elementsLinkedList = new LinkedList<>();

    public void addElements() {
        for (int i = 0; i < 1_000_000; i++) {
            elementsArrayList.add(i);
            elementsLinkedList.add(i);
        }
    }

    public void choose(){
        long startTimeArrayList = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            int index = (int)(Math.random()*(1_000_000-1));
            elementsArrayList.get(index);
        }
        long totalTimeArrayList = System.currentTimeMillis() - startTimeArrayList;
        System.out.println("Total time of array list: " + totalTimeArrayList);

        long startTimeLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            int index = (int)(Math.random()*(1_000_000 - 1));
            elementsLinkedList.get(index);
        }
        long totalTimeLinkedList = System.currentTimeMillis() - startTimeLinkedList;
        System.out.println("Total time of linked list: " + totalTimeLinkedList);

        if(totalTimeArrayList < totalTimeLinkedList){
            System.out.println("Array List is faster");
        }else if(totalTimeLinkedList < totalTimeArrayList){
            System.out.println("Linked List is faster");
        }else{
            System.out.println("They are equal.");
        }
    }

    public static void main(String[] args) {
        AddElements one = new AddElements();
        one.addElements();
        one.choose();
    }
}
