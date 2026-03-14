package com.gla.methods.Level2;
import java.util.*;

//Write a program to take user input for 5 numbers and check whether a number is positive or
//negative. Further for positive numbers check if the number is even or odd. Finally compare
//the first and last elements of the array and display if they are equal, greater, or less
//Hint =>
//a. Write a Method to Check whether the number is positive or negative
//b. Write a Method to check whether the number is even or odd
//c. Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both
//are equal or -1 if number1 < number2
//d. In the main program, Loop through the array using the length call the method
//isPositive() and if positive call method isEven() and print accordingly
//e. If the number is negative, print negative.
//f. Finally compare the first and last element of the array by calling the method compare()
//and display if they are equal, greater, or less

public class NumberChecker {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is positive and even.");
                } else {
                    System.out.println(numbers[i] + " is positive and odd.");
                }
            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("The first element is greater than the last element.");
        } else if (result == 0) {
            System.out.println("The first and last elements are equal.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        sc.close();
    }
}