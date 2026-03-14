package com.gla.classandobject.Level1;
import java.util.Scanner;

class PalindromeChecker {
    String text;
    String reversed = "";

    void checkPalindrome() {
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
    }

    void displayResult() {
        if (text.equalsIgnoreCase(reversed))
            System.out.println("The string is a Palindrome");
        else
            System.out.println("The string is not a Palindrome");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PalindromeChecker p = new PalindromeChecker();

        System.out.print("Enter a String: ");
        p.text = sc.nextLine();

        p.checkPalindrome();
        p.displayResult();

        sc.close();
    }
}
