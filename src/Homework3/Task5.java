package Homework3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        System.out.println("Enter second number: ");
        double n = sc.nextDouble();

        double result = Math.pow(x, n);
        System.out.println("x^n = " + result);
    }
}
