package com.implementing;
public class Runner3{
    public static void main(String[] args) {
        String password = "Secure@123";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}
