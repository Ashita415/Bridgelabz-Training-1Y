package com.gla.methods.Level1;
import java.util.*;

//Write a program to check whether a number is positive, negative, or zero.
//        Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1
//        for positive number and 0 if number is zero

public class Positive {
    public static void positiveNegative(int a) {
        if (a > 0) {
            System.out.println("Positive");
        } else if (a < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        positiveNegative(a);

    }
}
