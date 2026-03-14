package com.gla.methods.Level2;
import java.util.*;

//Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do
//the following. Please define static methods for all the UnitConvertor class methods. E.g.
//public static double convertFarhenheitToCelsius(double farhenheit) =>
//a. Method to convert Fahrenheit to Celsius and return the value. Use the following code
//double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
//b. Method to convert Celsius to Fahrenheit and return the value. Use the following code
//double celsius2farhenheit = (celsius * 9 / 5) + 32;
//c. Method to convert pounds to kilograms and return the value. Use the following code
//double pounds2kilograms = 0.453592;
//d. Method to convert kilograms to pounds and return the value. Use the following code
//double kilograms2pounds = 2.20462;
//e. Method to convert gallons to liters and return the value. Use following code to convert
//double gallons2liters = 3.78541;
//f. Method to convert liters to gallons and return the value. Use following code to convert
//double liters2gallons = 0.264172;

public class UnitConvertor2 {
    public static double FahrenheitToCelsius(double farhenheit) {
        double Fahrenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit * Fahrenheit2celsius;
    }

    public static double celsiusToFarhenheit(double celsius) {
        double celsius2Fahrenheit = (celsius * 9 / 5) + 32;
        return celsius * celsius2Fahrenheit;
    }

    public static double poundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double kilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double gallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double litersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Fahrenheit : ");
        double Fahrenheit = sc.nextDouble();
        System.out.println("Fahrenheit : " + UnitConvertor2.FahrenheitToCelsius(Fahrenheit));


        System.out.println("Enter the Celsius : ");
        double celsius = sc.nextDouble();
        System.out.println("Celsius : " + UnitConvertor2.celsiusToFarhenheit(celsius));


        System.out.println("Enter the pounds : ");
        double pounds = sc.nextDouble();
        System.out.println("pounds : " + UnitConvertor2.poundsToKilograms(pounds));


        System.out.println("Enter the kilograms : ");
        double kilograms = sc.nextDouble();
        System.out.println("kilograms : " + UnitConvertor2.kilogramsToPounds(kilograms));


        System.out.println("Enter the gallons : ");
        double gallons = sc.nextDouble();
        System.out.println("gallons : " + UnitConvertor2.gallonsToLiters(gallons));


        System.out.println("Enter the liters : ");
        double liters = sc.nextDouble();
        System.out.println("liters : " + UnitConvertor2.litersToGallons(liters));
    }
}







