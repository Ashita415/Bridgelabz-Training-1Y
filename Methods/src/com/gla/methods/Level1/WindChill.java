package com.gla.methods.Level1;
import java.util.Scanner;

//Write a program calculate the wind chill temperature given the temperature and wind speed
//Hint =>
//a. Write a method to calculate the wind chill temperature using the formula
//windChill = 35. 74 + 0. 6215 * temp + (0. 4275 * temp − 35. 75) * windSpeed*0.16

public class WindChill {

    public static double calculateWindChill(double temperature, double windSpeed) {

        double WindChill = 35.74 + 0.6215 * temperature +
                (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

        return WindChill;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Enter wind speed: ");
        double speed = sc.nextDouble();

        double result = calculateWindChill(temp, speed);

        System.out.println("Wind Chill Temperature = " + result);


    }
}
