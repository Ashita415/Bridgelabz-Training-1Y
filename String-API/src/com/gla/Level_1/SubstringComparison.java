package com.gla.Level_1;
import java.util.*;
public class SubstringComparison {
    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
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
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String substringCharAt = createSubstring(text, start, end);
        String substringBuiltIn = text.substring(start, end);

        boolean result = compareStrings(substringCharAt, substringBuiltIn);

        System.out.println("Substring using charAt(): " + substringCharAt);
        System.out.println("Substring using substring(): " + substringBuiltIn);
        System.out.println("Both substrings are same: " + result);
    }
}
