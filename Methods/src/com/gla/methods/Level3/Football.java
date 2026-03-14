package com.gla.methods.Level3;
import java.util.*;

//Create a program to find the shortest, tallest, and mean height of players present in a
//football team.
//Hint =>
//a. The formula to calculate the mean is: mean = sum of all elements/number of elements
//b. Create an int array named heights of size 11 and get 3 digits random height in cms for
//each player in the range 150 cms to 250 cms
//c. Write the method to Find the sum of all the elements present in the array.
//d. Write the method to find the mean height of the players on the football team
//e. Write the method to find the shortest height of the players on the football team
//f. Write the method to find the tallest height of the players on the football team
//g. Finally display the results

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] heights = new int[11];

        System.out.println("Enter heights of 11 players in cm:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = scanner.nextInt();
        }

        System.out.print("\nPlayer Heights: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        int total = calculateSum(heights);
        double mean = calculateMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("\nTotal height sum: " + total + " cm");
        System.out.println("Mean height: " + mean + " cm");
        System.out.println("Shortest player: " + shortest + " cm");
        System.out.println("Tallest player: " + tallest + " cm");

        scanner.close();
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int h : arr) {
            sum += h;
        }
        return sum;
    }

    public static double calculateMean(int[] arr) {
        return (double) calculateSum(arr) / arr.length;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }
}
