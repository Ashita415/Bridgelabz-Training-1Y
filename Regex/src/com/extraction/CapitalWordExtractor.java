package com.extraction;
import java.util.*;
import java.util.regex.*;

public class CapitalWordExtractor {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        String pattern = "\\b[A-Z][a-z]*\\b";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while (m.find()) {
            String word = m.group();

            if (!word.equals("The")) {
                System.out.println(word);
            }
        }
    }
}
