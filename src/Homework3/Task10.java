package Homework3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random()*25);
            System.out.print(array[i] + " ");
        }

        int max = array[0];
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("\nMaximum = " + max);
    }
}
