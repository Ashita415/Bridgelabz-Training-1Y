package com.gla.methods.Level3;
import java.util.*;
public class Factor {
    public static int []getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int factors[] = new int[count];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }
    public static int greatestFactor(int arr[]) {
        return arr[arr.length - 1];
    }
    public static int sumFactors(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int productFactors(int arr[]) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }
    public static double productCubeFactors(int arr[]) {
        double product = 1;

        for (int i = 0; i < arr.length; i++) {
            product *= arr[i]*arr[i]*arr[i];
        }

        return product;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int factors[] = getFactors(num);

        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        System.out.println("\nGreatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumFactors(factors));
        System.out.println("Product of Factors: " + productFactors(factors));
        System.out.println("Product of Cube of Factors: " + productCubeFactors(factors));
    }
}
