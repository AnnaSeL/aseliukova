package Homework3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random()*25);
            System.out.print(array[i] + " ");
        }

        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] < min){
              min = array[i];
              index = i;
            }
        }
        System.out.print("\nMinimum: " + min + " ");
        for (int i = 0; i < array.length; i++) {
            if(min == array[i] && i != index){
                System.out.print(array[i] + " ");
            }
        }
    }
}
