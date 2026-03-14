package com.gla.methods.Level2;
import java.util.*;

//Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do
//the following. Please define static methods for all the UnitConvertor class methods. E.g.
//public static double convertKmToMiles(double km) =>
//a. Method To convert kilometers to miles and return the value. Use the following code
//double km2miles = 0.621371;
//b. Method to convert miles to kilometers and return the value. Use the following code
//double miles2km = 1.60934;
//c. Method to convert meters to feet and return the value. Use the following code to convert
//double meters2feet = 3.28084;
//d. Method to convert feet to meters and return the value. Use the following code to convert
//double feet2meters = 0.3048;

public class UnitConvertor {

    public static double KmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double MilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double MetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double FeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();
        System.out.println("Miles: " + UnitConvertor.KmToMiles(km));

        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();
        System.out.println("Kilometers: " + UnitConvertor.MilesToKm(miles));

        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();
        System.out.println("Feet: " + UnitConvertor.MetersToFeet(meters));

        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();
        System.out.println("Meters: " + UnitConvertor.FeetToMeters(feet));
    }
}