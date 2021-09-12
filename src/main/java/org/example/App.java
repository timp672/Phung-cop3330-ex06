/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int age1=0;
        int age2=0;

        //Prompt user input
        System.out.println("What is your current age? ");
        String age = scan.nextLine();
        System.out.println("At what age would you like to retire? ");
        String retire = scan.nextLine();

        //Convert strings
        age1 = Integer.parseInt(age);
        age2 = Integer.parseInt(retire);

        int yearsLeft = age2 - age1;

        //Retrieve year
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int retYear = year + yearsLeft;

        //Print outputs
        System.out.println("You have " +yearsLeft+ " years left until you can retire." );
        System.out.println("It's " +year+ ", so you can retire in " +retYear+ "." );
    }
}
