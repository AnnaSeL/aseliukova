package Homework3;

import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1, i = 1;

        while(i<n+1){
            factorial *= i;
            i++;
        }
        System.out.println("Factorial = " + factorial);
    }
}
