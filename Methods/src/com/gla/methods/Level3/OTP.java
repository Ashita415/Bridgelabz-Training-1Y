package com.gla.methods.Level3;
import java.util.*;
public class OTP {
    public static int generateOTP() {
        int otp = (int)(Math.random() * 900000) + 100000;
        return otp;
    }
    public static boolean checkUnique(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    return false;
                }

            }
        }

        return true;
    }

    public static void main(String[] args) {

        int otpArray[] = new int[10];

        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otpArray.length; i++) {
            System.out.println(otpArray[i]);
        }

        if (checkUnique(otpArray)) {
            System.out.println("All OTPs are unique");
        } else {
            System.out.println("Some OTPs are same");
        }

    }
}
