package com.gla.methods.Level2;
import java.util.Scanner;

//Create a program to find the factors of a number taken as user input, store the factors in an
//array, and display the factors. Also find the sum, sum of square of factors and product of the
//factors and display the results
//Hint =>
//a. Take the input for a number
//b. Write a static Method to find the factors of the number and save them in an array and
//return the array.
//c. To find factors and save to array will have two loops. The first loop to find the count and
//initialize the array with the count. And the second loop save the factors into the array
//d. Write a method to find the sum of the factors using factors array
//e. Write a method to find the product of the factors using factors array
//f. Write a method to find the sum of square of the factors using Math.pow() method

public class Factor {

    public static int[] findFactors(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];

        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    public static int findSum(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    public static long findProduct(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    public static double findSumOfSquares(int[] factors) {
        double sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += Math.pow(factors[i], 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.print("Factors are: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        System.out.println("\nSum of factors: " + findSum(factors));
        System.out.println("Product of factors: " + findProduct(factors));
        System.out.println("Sum of squares of factors: " + findSumOfSquares(factors));

    }
}
