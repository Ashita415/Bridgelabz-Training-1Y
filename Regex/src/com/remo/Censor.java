package com.remo;
import java.util.regex.*;

public class Censor {
    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid bad words.";

        String[] badWords = {"damn", "stupid"};

        for (String word : badWords) {
            String pattern = "\\b" + word + "\\b";
            input = input.replaceAll(pattern, "****");
        }

        System.out.println(input);
    }
}