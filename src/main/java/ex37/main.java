package ex37;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Judah Libera
 */

import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        char[] let = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] car = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', ':', ';', '[', ']', '{', '}', '|', '+', '=', '-', '_', '\"', '\'', '?', '<', '>', ',', '.', '`', '~', '/', '\\'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        ArrayList<Character> pas = new ArrayList<Character>();
        System.out.printf("What's the minimum length? ");
        int totalchars = sc.nextInt();
        System.out.printf("How many special characters? ");
        int caramnt = sc.nextInt();
        System.out.printf("How many numbers? ");
        int numamnt = sc.nextInt();
        while((caramnt + numamnt) * 2 > totalchars)
            totalchars++;
        int w = 0;
        for(int i = 0; i < totalchars - (caramnt + numamnt); i++)
        {
            w = (int) Math.floor(Math.random() * (let.length));
            pas.add(let[w]);
        }
        for(int i = 0; i < caramnt; i++)
        {
            w = (int) Math.floor(Math.random() * (car.length));
            pas.add(car[w]);
        }
        for(int i = 0; i < numamnt; i++)
        {
            w = (int) Math.floor(Math.random() * (num.length));
            pas.add(num[w]);
        }

        Collections.shuffle(pas);
            System.out.printf("Your password is ");
        for (int i = 0; i < pas.size(); i++)
            System.out.printf("%c", pas.get(i));
    }
}