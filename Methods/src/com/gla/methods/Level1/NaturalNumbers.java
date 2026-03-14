package com.gla.methods.Level1;
import java.util.*;

//Write a program to find the sum of n natural numbers using loop
//Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers
//using loop

public class NaturalNumbers {
    public static int naturalNumber(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
        System.out.println("Natural number : "+naturalNumber(n));
    }
}
