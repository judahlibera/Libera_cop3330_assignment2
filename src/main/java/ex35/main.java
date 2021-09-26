package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Judah Libera
 */

import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> ar = new ArrayList<String>();
        while(true)
        {
            System.out.printf("Enter a name: ");
            String addthis = sc.nextLine();
            if(addthis == "")
                break;
            ar.add(addthis);
        }
        int w = (int) Math.floor(Math.random() * (ar.size()));
        System.out.printf("The winner is... %s.", ar.get(w));
    }
}