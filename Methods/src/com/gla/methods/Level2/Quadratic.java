package com.gla.methods.Level2;
import java.util.Scanner;

//Write a program Quadratic to find the roots of the equation ax . Use Math
//
//2
//        + bx + c
//
//functions Math.pow() and Math.sqrt()
//Hint =>
//        a. Take a, b, and c as input values to find the roots of x.
//b. The roots are computed using the following formulae
//delta = b
//2
//        + 4 * a * c
//
//If delta is positive the find the two roots using formulae
//root1 of x = (− b + delta)/(2 * a)
//root1 of x = (− b − delta)/(2 * a)
//If delta is zero then there is only one root of x
//root of x = − b/(2 * a)
//If delta is negative return empty array or nothing
//c. Write a Method to find find the roots of a quadratic equation and return the roots


public class Quadratic {

    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[]{};
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 2) {
            System.out.println("The roots are: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("There is one root: " + roots[0]);
        } else {
            System.out.println("No real roots exist.");
        }

        sc.close();
    }
}
