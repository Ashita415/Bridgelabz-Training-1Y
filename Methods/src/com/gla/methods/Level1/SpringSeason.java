package com.gla.methods.Level1;
import java.util.Scanner;

//Write a program SpringSeason that takes two int values month and day from the command
//line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
//Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring
//season and return a boolean true or false


public class SpringSeason {

    public static boolean isSpring(int month, int day) {
        return (month == 3 && day >= 20 && day <= 31) ||
                (month == 4 && day >= 1 && day <= 30) ||
                (month == 5 && day >= 1 && day <= 31) ||
                (month == 6 && day >= 1 && day <= 20);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        if (isSpring(month, day)) {
            System.out.println("Its a Spring Season");
        }
        else {
            System.out.println("Not a Spring Season");
        }

        sc.close();
    }
}