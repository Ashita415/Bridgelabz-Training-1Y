package com.advance;
import java.util.regex.*;

public class Language {
    public static void main(String[] args) {
        String text = "I love Java, Python, and C, but I haven't tried Go yet.";

        String pattern = "\\b(Java|Python|C|Go)\\b";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
