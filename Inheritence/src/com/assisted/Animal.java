package com.assisted;

public class Animal {
    String name;
    int age;
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    public Animal() {

    }

    public void makeSound(){
        System.out.println("Animals make sound.");
    }
}

