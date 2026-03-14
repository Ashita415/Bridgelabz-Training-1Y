package com.gla.Level_1;
import java.util.*;
public class LowerCaseComparison {
    public static String convertToLower(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result += ch;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String userLower = convertToLower(text);
        String builtInLower = text.toLowerCase();

        boolean result = compareStrings(userLower, builtInLower);

        System.out.println("User-defined lowercase: " + userLower);
        System.out.println("Built-in toLowerCase(): " + builtInLower);
        System.out.println("Both results are same: " + result);
    }
}