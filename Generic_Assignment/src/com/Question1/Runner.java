package com.Question1;

public class Runner {
        public static void main(String[] args) {
            Box<Integer> intBox = new Box<>();
            intBox.set(22);
            System.out.println("Integer: " + intBox.get());

            Box<String> strBox = new Box<>();
            strBox.set("Ashita Yadav");
            System.out.println("String: " + strBox.get());

            Box<Double> doubleBox = new Box<>();
            doubleBox.set(86.25);
            System.out.println("Double: " + doubleBox.get());
        }
}
