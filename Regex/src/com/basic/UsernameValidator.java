package com.basic;

public class UsernameValidator {
    public static boolean isValidUsername(String username) {
        String pattern = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        return username.matches(pattern);
    }

    public static void main(String[] args) {
        System.out.println(isValidUsername("Ashita_349"));
        System.out.println(isValidUsername("349Ashita"));
        System.out.println(isValidUsername("ay"));
    }
}
