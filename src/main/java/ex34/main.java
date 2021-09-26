package ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Judah Libera
 */

import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        String[] emp = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        System.out.printf("There are %d employees:\n", emp.length);
        for(int i = 0; i < emp.length; i++)
            System.out.printf("%s\n", emp[i]);
        System.out.printf("\nEnter an employee name to remove: ");
        String er = sc.nextLine();
        int ind = 0;
        for(int i = 0; i < emp.length; i++)
        {
            if(Objects.equals(emp[i],er) == true)
                ind = i;
        }
        String newar[];
        newar = new String[emp.length-1];
        for(int i = 0; i < emp.length-1; i++)
        {
            if(i < ind)
                newar[i] = emp[i];
            else
                newar[i] = emp[i + 1];
        }
        System.out.printf("\nThere are %d employees:\n", newar.length);
        for(int i = 0; i < newar.length; i++)
            System.out.printf("%s\n", newar[i]);
    }
}