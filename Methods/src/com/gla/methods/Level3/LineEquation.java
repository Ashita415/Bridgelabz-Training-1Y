package com.gla.methods.Level3;
import java.util.Scanner;
public class LineEquation {
    public static double findDistance(double x1, double y1, double x2, double y2) {

        double distance = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );

        return distance;
    }
    public static double[] findLine(double x1, double y1, double x2, double y2) {

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        double result[] = new double[2];
        result[0] = m;
        result[1] = b;

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        double line[] = findLine(x1, y1, x2, y2);

        System.out.println("Euclidean Distance = " + distance);
        System.out.println("Slope (m) = " + line[0]);
        System.out.println("Intercept (b) = " + line[1]);

        System.out.println("Equation of Line: y = " + line[0] + "x + " + line[1]);
    }
}
