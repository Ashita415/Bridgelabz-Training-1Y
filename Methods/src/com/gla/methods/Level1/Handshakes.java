package com.gla.methods.Level1;
import java.util.*;

//Create a program to find the maximum number of handshakes among students.
//Hint =>
//a. Get integer input for the numberOfStudents variable.
//b. Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of
//possible handshakes.
//c. Write a method to use the combination formulae to calculate the number of handshakes
//d. Display the number of possible handshakes.

public class Handshakes {
        public static int handshakes(int n){
            int max=(n*(n-1))/2;
            return max;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("Maximum number of possible handshakes :"+handshakes(n));
        }
    }
