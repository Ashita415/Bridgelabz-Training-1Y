package com.gla.methods.Level1;
import java.util.Scanner;

//Write a program to calculate various trigonometric functions using Math class given an angle in degrees
//    Hint =>
//a. Method to calculate various trigonometric functions, Firstly convert to radians and then
//use Math function to find sine, cosine and tangent.

public class TrigonometricFunctions {

    public static double[] calculateTrigonometricFunctions(double angle) {

        double radians = Math.toRadians(angle);

        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] result = calculateTrigonometricFunctions(angle);

        System.out.println("Sin = " + result[0]);
        System.out.println("Cos = " + result[1]);
        System.out.println("Tan = " + result[2]);

        sc.close();
    }
}
