package Homework3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i < n+1; i++) {
            factorial *= i;
        }
        System.out.println("Factorial = " + factorial);
    }
}
