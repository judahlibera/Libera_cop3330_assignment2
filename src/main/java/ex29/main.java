package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Judah Libera
 */

import java.util.*;
public class main {
    public static int getinput(Scanner sc)
    {
        int n = 0;
        while(true) {
            System.out.printf("What is the rate of return? ");
            String in = sc.nextLine();
            try {
                n = Integer.parseInt(in);
                if(n == 0)
                    System.out.printf("Sorry. That is not a valid input\n");
                else
                    break;
            } catch (NumberFormatException ne) {
                System.out.printf("Sorry. That is not a valid input\n");
            }
        }
        return n;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int ror = getinput(sc);
        System.out.printf("It will take %.0f years to double your initial investment.", 72/(double)ror);
    }
}