package com.gla.methods.Level1;
import java.util.Scanner;

//Create a program to divide N number of chocolates among M children. Print the number of
//chocolates each child will get and also the remaining chocolates
//Hint =>
//a. Get an integer value from user for the numberOfchocolates and numberOfChildren.
//b. Write the method to find the number of chocolates each child gets and number of
//remaining chocolates

public class Chocolates {

    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int chocolatesPerChild = number / divisor;
        int remainingChocolates = number % divisor;

        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);

        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);


    }
}