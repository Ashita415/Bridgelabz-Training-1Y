package com.Question2;

public class Runner {
        public static void main(String[] args) {
            Pair<String, Integer> student = new Pair<>("Ashita Yadav", 22);

            System.out.println("Name: " + student.getFirst());
            System.out.println("Roll No.: " + student.getSecond());
        }
}
