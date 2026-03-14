package com.gla.methods.Level1;
import java.util.*;

//An athlete runs in a triangular park with sides provided as input by the user in meters. If the
//athlete wants to complete a 5 km run, then how many rounds must the athlete complete
//Hint =>
//a. Take user input for 3 sides of a triangle
//b. The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
//c. Write a Method to compute the number of rounds user needs to do to complete 5km run

public class Athlete {
        public static double triangle(double x,double y,double z){
            int distance=5000;
            double rounds = distance/(x+y+z);
            return rounds;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter x :");
            double x = sc.nextDouble();
            System.out.print("Enter y :");
            double y = sc.nextDouble();
            System.out.print("Enter z :");
            double z = sc.nextDouble();

            System.out.println("Round must be completed by athlete : "+triangle(x,y,z));

        }
    }