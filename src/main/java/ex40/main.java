package ex40;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Judah Libera
 */

import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);

        Map<String, List<String>> emp = new TreeMap<>();

        List<String> Johnson = new ArrayList<>();
        Johnson.add("John");
        Johnson.add("Johnson");
        Johnson.add("Manager");
        Johnson.add("2016-12-31");
        emp.put("Johnson", Johnson);

        List<String> Jacobson = new ArrayList<>();
        Jacobson.add("Jake");
        Jacobson.add("Jacobson");
        Jacobson.add("Programmer");
        Jacobson.add("");
        emp.put("Jacobson", Jacobson);

        List<String> Xiong = new ArrayList<>();
        Xiong.add("Tou");
        Xiong.add("Xiong");
        Xiong.add("Software Engineer");
        Xiong.add("2016-10-05");
        emp.put("Xiong", Xiong);

        List<String> Michaelson = new ArrayList<>();
        Michaelson.add("Michaela");
        Michaelson.add("Michaelson");
        Michaelson.add("District Manager");
        Michaelson.add("2015-12-19");
        emp.put("Michaelson", Michaelson);

        List<String> Jackson = new ArrayList<>();
        Jackson.add("Jacquelyn");
        Jackson.add("Jackson");
        Jackson.add("DBA");
        Jackson.add("");
        emp.put("Jackson", Jackson);

        List<String> Webber = new ArrayList<>();
        Webber.add("Sally");
        Webber.add("");
        Webber.add("Web Developer");
        Webber.add("2015-12-18");
        emp.put("Webber", Webber);

        System.out.printf("Enter a search String: ");
        String search = sc.nextLine();
        System.out.printf("\nResults:\n\n");


        Set<Map.Entry<String, List<String>>> entries = emp.entrySet();

        Map<String, List<String>> empsr = new TreeMap<>();
        for (Map.Entry<String, List<String>> entry : entries)
        {
            if(entry.getValue().get(1).toLowerCase().indexOf(search) >= 0)
                empsr.put(entry.getKey(), entry.getValue());
        }

        Set<Map.Entry<String, List<String>>> entries2 = empsr.entrySet();
        System.out.printf("Name\t\t\t\t| Position\t| Separation date\n--------------------------------------------------\n");
        for (Map.Entry<String, List<String>> entry : entries2)
            System.out.printf(entry.getValue().get(0) + " " + "%-18s" + "| " + entry.getValue().get(2) + "\t| " + entry.getValue().get(3) + "\n", entry.getValue().get(1));

    }
}