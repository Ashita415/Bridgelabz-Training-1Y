package com.gla.methods.Level1;
import java.util.Scanner;

//Write a program to take 2 numbers and print their quotient and reminder
//Hint =>
//a. Take user input as integer
//b. Use division operator (/) for quotient and moduli operator (%) for reminder
//c. Write Method to find the reminder and the quotient of a number

public class RemainderQuotient {

    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient = " + result[0]);
        System.out.println("Remainder = " + result[1]);


    }
}
