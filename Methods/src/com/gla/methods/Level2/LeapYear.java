package com.gla.methods.Level2;
import java.util.*;

//Write a program that takes a year as input and outputs the Year is a Leap Year or not
//Hint =>
//a. The LeapYear program only works for year >= 1582, corresponding to a year in the
//Gregorian calendar.
//b. Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
//c. Write a method to check for Leap Year using the conditions a and b

public class LeapYear {
    public static void leapYear(int a) {
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int a=sc.nextInt();
        leapYear(a);
    }
}
