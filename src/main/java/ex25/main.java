/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Judah Libera
 */
package ex25;

import java.util.*;
public class main {
    public static int ps(String p)
    {
        int hasnum = 0, haslet = 0, haschar = 0;

        for (int i = 0; i < 10; i++)
        {
            String si = Integer.toString(i);
            if (p.contains(si))
                hasnum = 1;
        }
        for (int i = 97; i < 123; i++)
        {
            String si = Character.toString((char)i);
            if (p.contains(si))
                haslet = 1;
        }
        for (int i = 65; i < 91; i++)
        {
            String si = Character.toString((char)i);
            if (p.contains(si))
                haslet = 1;
        }
        for (int i = 33; i < 127; i++)
        {
            if(i >= 48 && i < 58)
                continue;
            if (i >= 65 && i < 91)
                continue;
            if (i >= 97 && i < 123)
                continue;
            String si = Character.toString((char)i);
            if (p.contains(si))
                haschar = 1;
        }




        if(p.length() > 8 && haslet == 1 && hasnum == 1 && haschar == 1)
            return 3;
        if(p.length() > 8 && haslet == 1 && hasnum == 1)
            return 2;
        if(hasnum == 0 && haschar == 0)
            return 1;
        if(haslet == 0 && haschar == 0 && p.length() < 8)
            return 0;

        return 4;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter password: ");
        String p = sc.nextLine();
        int ps = ps(p);
        switch (ps)
        {
            case 0: System.out.printf("%s is a very weak password.", p);
                break;
            case 1: System.out.printf("%s is a weak password.", p);
                break;
            case 2: System.out.printf("%s is a strong password.", p);
                break;
            case 3: System.out.printf("%s is a very strong password.", p);
                break;
            case 4: System.out.printf("Password does not fall within any strength category based on given criteria");
                break;
            default:
                break;
        }
    }
}