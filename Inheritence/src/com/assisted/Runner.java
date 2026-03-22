package com.assisted;

public class Runner {
        public static void main(String[] args) {
            Animal a1 = new Dog("Dog", 3);
            Animal a2 = new Cat("Cat", 2);
            Animal a3 = new Bird("Bird", 1);
            a1.makeSound();
            a2.makeSound();
            a3.makeSound();
        }
}
