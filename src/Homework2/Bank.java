package Homework2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your contribution: ");
        BigDecimal contribution = sc.nextBigDecimal();

        System.out.println("Enter annual interest rate: ");
        double percent = sc.nextDouble();

        System.out.println("Enter the number of years: ");
        int years = sc.nextInt();

        double onePercent = percent/100;

        BigDecimal result = new BigDecimal("0.0");

        for (int i = 0; i < years; i++) {
            if(i == 0){
                result = contribution.add(contribution.multiply(BigDecimal.valueOf(onePercent)));
                System.out.println("Interest = " + contribution.multiply(BigDecimal.valueOf(onePercent)) + " grn.");
            }else{
                result = result.add(result.multiply(BigDecimal.valueOf(onePercent)));
                System.out.println("Interest = " + result.multiply(BigDecimal.valueOf(onePercent)) + " grn.");
            }
            System.out.println("Money with interest = " + result + " grn.");
        }
        System.out.println();
    }
}
