package Homework3;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1, i = 1;

        do{
            factorial *= i;
            i++;
        }while(i<n+1);
        System.out.println("Factorial = " + factorial);
    }
}
