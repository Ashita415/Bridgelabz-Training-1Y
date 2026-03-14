package com.gla.Level_1;
import java.util.*;
public class CharArrayComparison {
    public static char[] getCharacters(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        char[] userDefinedArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        boolean result = compareCharArrays(userDefinedArray, builtInArray);

        System.out.print("User-defined method result: ");
        for (char c : userDefinedArray) {
            System.out.print(c + " ");
        }

        System.out.println();
        System.out.print("Built-in toCharArray() result: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println();
        System.out.println("Both arrays are same: " + result);
    }
}
