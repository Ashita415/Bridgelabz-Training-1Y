package com.gla.methods.Level3;
import java.util.Scanner;
public class NumberChecker {

    public static int countDigits(int num) {
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }

        return count;
    }
    public static int[] getDigits(int num) {
        int n = countDigits(num);
        int digits[] = new int[n];
        for(int i = n-1; i >= 0; i--){
            digits[i] = num % 10;
            num = num / 10;
        }

        return digits;
    }
    public static boolean isDuck(int digits[]) {

        for(int i = 1; i < digits.length; i++){
            if(digits[i] == 0){
                return true;
            }
        }

        return false;
    }
    public static boolean isArmstrong(int num, int digits[]) {
        int power = digits.length;
        int sum = 0;
        for(int d : digits){
            sum += Math.pow(d, power);
        }

        return sum == num;
    }
    public static void largestTwo(int digits[]) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int d : digits){
            if(d > largest){
                second = largest;
                largest = d;
            }
            else if(d > second && d != largest){
                second = d;
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);
    }
    public static void smallestTwo(int digits[]) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int d : digits){
            if(d < smallest){
                second = smallest;
                smallest = d;
            }
            else if(d < second && d != smallest){
                second = d;
            }
        }
        System.out.println("Smallest = " + smallest);
        System.out.println("Second Smallest = " + second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int digits[] = getDigits(num);

        System.out.println("Digit Count = " + countDigits(num));
        System.out.println("Digits in array:");
        for(int d : digits){
            System.out.print(d + " ");
        }

        System.out.println("\nDuck Number: " + isDuck(digits));
        System.out.println("Armstrong Number: " + isArmstrong(num, digits));

        largestTwo(digits);
        smallestTwo(digits);
    }
}
