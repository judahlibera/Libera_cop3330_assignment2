package ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Judah Libera
 */

import java.util.*;
public class main {
    public static double average(ArrayList<Integer> n){
        int num = 0;
        for(int i = 0; i < n.size(); i++)
            num += n.get(i);
        return num/n.size();
    }
    public static int max(ArrayList<Integer> n){
        int max = n.get(0);
        for(int i = 1; i < n.size(); i++)
        {
            if(n.get(i) > max)
                max = n.get(i);
        }
        return max;
    }
    public static int min(ArrayList<Integer> n){
        int min = n.get(0);
        for(int i = 1; i < n.size(); i++)
        {
            if(n.get(i) < min)
                min = n.get(i);
        }
        return min;
    }
    public static double std(ArrayList<Integer> n){
        double m = average(n);
        double s = 0;
        for(int i = 1; i < n.size(); i++)
            s += Math.pow((n.get(i) - m),2);

        return Math.sqrt(s/m);
    }
    public static Integer getinput(Scanner sc)
    {
        int n = 0;
        while(true) {
            String in = sc.nextLine();
            if (Objects.equals(in, "done"))
                return null;
            try {
                n = Integer.parseInt(in);
                break;
            } catch (NumberFormatException ne) {}
        }
        return n;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<Integer>();
        while(true) {
            System.out.printf("Enter a number: ");
            Integer temp = getinput(sc);
            if (temp == null)
                break;
            else
                num.add(temp);
        }
        System.out.printf("Numbers: ");
        System.out.println(num);
        System.out.printf("The average is %.1f.\nThe minimum is %d.\nThe maximum is %d." +
                "\nThe standard deviation is %.2f.", average(num), min(num), max(num), std(num));
    }
}