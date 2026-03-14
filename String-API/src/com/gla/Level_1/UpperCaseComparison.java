package com.gla.Level_1;
import java.util.*;
public class UpperCaseComparison {
    public static String convertToUpper(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
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

        String userUpper = convertToUpper(text);
        String builtInUpper = text.toUpperCase();

        boolean result = compareStrings(userUpper, builtInUpper);

        System.out.println("User-defined uppercase: " + userUpper);
        System.out.println("Built-in toUpperCase(): " + builtInUpper);
        System.out.println("Both results are same: " + result);
    }
}
