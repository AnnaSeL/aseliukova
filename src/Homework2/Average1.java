package Homework2;

import java.util.Scanner;

public class Average1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first = sc.nextInt();

        System.out.println("Enter second number: ");
        int second = sc.nextInt();

        double average = (double) (first+second)/2;
        System.out.println("Average = " + average);
    }
}
