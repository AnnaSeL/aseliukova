package Homework2;

import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of numbers: ");
        int amount = sc.nextInt();

        int[] arrayOfNumbers = new int[amount];
        int sum = 0;
        for (int i = 0; i < amount; i++) {
            System.out.println("Enter the number: ");
            arrayOfNumbers[i] = sc.nextInt();
            sum += arrayOfNumbers[i];
        }

        double average = (double) sum/amount;
        System.out.println("Average = " + average);
    }
}
