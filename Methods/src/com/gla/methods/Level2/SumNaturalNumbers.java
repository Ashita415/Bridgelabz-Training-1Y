package com.gla.methods.Level2;
import java.util.Scanner;

//Write a program to find the sum of n natural numbers using recursive method and compare
//the result with the formulae n*(n+1)/2 and show the result from both computations is correct.
//        Hint =>
//a. Take the user input number and check whether it's a Natural number
//b. Write a Method to find the sum of n natural numbers using recursion
//c. Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2
//d. Compare the two results and print the result

public class SumNaturalNumbers {

    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int sumRec = recursiveSum(n);
        int sumFormula = formulaSum(n);

        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumRec == sumFormula) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results are not equal.");
        }

    }
}
