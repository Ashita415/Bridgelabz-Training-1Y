package com.basic;

public class LicensePlateValidator {
    public static boolean isValidPlate(String plate) {
        String pattern = "^[A-Z]{2}[0-9]{4}$";
        return plate.matches(pattern);
    }

    public static void main(String[] args) {
        System.out.println(isValidPlate("AY1234"));
        System.out.println(isValidPlate("A12345"));
        System.out.println(isValidPlate("ay1234"));
        System.out.println(isValidPlate("ASY123"));
    }
}
