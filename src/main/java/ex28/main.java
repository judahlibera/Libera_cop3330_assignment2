package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Judah Libera
 */

import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int count = 0;
        for(int i = 0; i < 5; i++)
        {
            System.out.printf("Enter a number: ");
            count += sc.nextInt();
        }
        System.out.printf("The total is %d.", count);
    }
}