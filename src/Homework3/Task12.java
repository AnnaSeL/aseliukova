package Homework3;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random()*100);
            System.out.print(array[i] + " ");
        }

        int sum = 0;

        for (int j : array) {
            sum += j;
        }
        double average = (double) sum/ array.length;
        System.out.printf("\nAverage = %.2f", average);
    }
}
