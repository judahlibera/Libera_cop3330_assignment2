package ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Judah Libera
 */

import java.util.*;
public class main {
    public static int gc = 0;
    public static int getinput(Scanner sc)
    {
        int n = 0;
        while(true) {
            String in = sc.nextLine();
            try {
                n = Integer.parseInt(in);
                break;
            } catch (NumberFormatException ne) {}
        }
        return n;
    }
    public static int getinput2(Scanner sc)
    {
        int n = 0;
        while(true) {
            String in = sc.nextLine();
            try {
                n = Integer.parseInt(in);
                gc++;
                break;
            } catch (NumberFormatException ne) {gc++;}
        }
        return n;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Let's play Guess the Number!\n");
        while(true)
        {
            System.out.printf("\nEnter the difficulty level (1, 2, or 3): ");
            int d = getinput(sc);
            int max = 10;
            if (d == 2)
                max = 100;
            if (d == 3)
                max = 1000;
            int num = (int) (Math.random() * (max + 1));
            boolean sp = true;
            System.out.printf("I have my number. Whats your guess? ");
            while (sp == true) {
                int guess = getinput2(sc);
                if (guess == num) {
                    System.out.printf("You got it in %d guesses!\n\n", gc);
                    sp = false;
                } else if (guess < num)
                    System.out.printf("Too low. Guess again: ");
                else
                    System.out.printf("Too high. Guess again: ");
            }
            System.out.printf("Do you wish to play again (y/n)? ");
            char pa = sc.next().charAt(0);
            if (pa == 'n' || pa == 'N')
                break;
        }
    }
}
