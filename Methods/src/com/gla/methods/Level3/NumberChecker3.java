package com.gla.methods.Level3;
import java.util.Scanner;

class NumberChecker3 {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static boolean isSpy(int num) {
        int sum = 0, product = 1, temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("\nNumber: " + number);
        System.out.println("Prime Number: " + NumberChecker3.isPrime(number));
        System.out.println("Neon Number: " + NumberChecker3.isNeon(number));
        System.out.println("Spy Number: " + NumberChecker3.isSpy(number));
        System.out.println("Automorphic Number: " + NumberChecker3.isAutomorphic(number));
        System.out.println("Buzz Number: " + NumberChecker3.isBuzz(number));

        scanner.close();
    }
}

