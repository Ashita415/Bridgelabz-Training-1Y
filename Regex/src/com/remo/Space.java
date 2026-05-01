package com.remo;

public class Space {
    public static void main(String[] args) {
        String input = "It's   me    The   Ashita           Yadav   .";

        String output = input.replaceAll("\\s+", " ");

        System.out.println(output);
    }
}
