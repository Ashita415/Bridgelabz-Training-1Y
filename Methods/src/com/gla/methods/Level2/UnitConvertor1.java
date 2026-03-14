package com.gla.methods.Level2;
import java.util.*;

//Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do
//the following. Please define static methods for all the UnitConvertor class methods. E.g.
//public static double convertYardsToFeet(double yards) =>
//a. Method to convert yards to feet and return the value. Use following code to convert
//double yards2feet = 3;
//b. Method to convert feet to yards and return the value. Use following code to convert
//double feet2yards = 0.333333;
//c. Method to convert meters to inches and return the value. Use following code to convert
//double meters2inches = 39.3701;
//d. Method to convert inches to meters and return the value. Use following code to convert
//double inches2meters = 0.0254;
//e. Method to convert inches to centimeters and return the value. Use the following code
//double inches2cm = 2.54;

public class UnitConvertor1 {
    public static double yardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double feetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double metersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double inchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double inchesToCm(double cm) {
        double inches2cm = 2.54;
        return cm * inches2cm;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the yards : ");
        double yards = sc.nextDouble();
        System.out.println("yards : " + UnitConvertor1.yardsToFeet(yards));


        System.out.println("Enter the feet : ");
        double feet = sc.nextDouble();
        System.out.println("feet : " + UnitConvertor1.feetToYards(feet));


        System.out.println("Enter the meters : ");
        double meters = sc.nextDouble();
        System.out.println("meters : " + UnitConvertor1.metersToInches(meters));


        System.out.println("Enter the inches : ");
        double inches = sc.nextDouble();
        System.out.println("inches : " + UnitConvertor1.inchesToMeters(inches));


        System.out.println("Enter the cm : ");
        double cm = sc.nextDouble();
        System.out.println("cm : " + UnitConvertor1.inchesToCm(cm));
    }
}




