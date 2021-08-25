package Homework3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("Multiplication table: ");
        for (int i = 1; i < 11; i++) {
            int result = x * i;
            System.out.printf("%d * %d = %d \n", x, i, result);
        }
    }
}
