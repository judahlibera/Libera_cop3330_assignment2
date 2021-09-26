/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Judah Libera
 */
package ex26;

import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("What is your balance? ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.printf("What is your APR (as a percent)? ");
        double apr = sc.nextDouble();
        sc.nextLine();
        System.out.printf("What is your monthly payment? ");
        double m = sc.nextDouble();
        sc.nextLine();
        System.out.printf("It will take you %f months to pay off this card.\nGiven equation does not work.", PaymentCalculator.calculateMonthsUntilPaidOff((apr*.01)/365, b, m));
    }
}