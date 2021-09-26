package ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Judah Libera
 */

import java.util.*;
public class main {
    public static int[] filterEvenNumbers(int [] a){
        int count = 0;
        int[] na = new int[a.length];
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 == 0)
                na[count++] = a[i];
        }
        int[] fa = new int[count];
        for(int i = 0; i < fa.length; i++)
            fa[i] = na[i];

        return fa;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter a list of numbers, separated by spaces: ");
        String s[] = sc.nextLine().split(" ");
        int[] a = new int[s.length];
        for(int i = 0; i < s.length; i++)
            a[i] = Integer.parseInt(s[i]);
        a = filterEvenNumbers(a); //picks up a 0 at end
        System.out.printf("The even numbers are");
        for(int i = 0; i < a.length; i++)
            System.out.printf(" %d", a[i]);
        System.out.printf(".");
    }
}