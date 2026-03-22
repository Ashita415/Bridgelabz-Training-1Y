package com.assisted;

public class Dog extends Animal{
    Dog(String name,int age){
        super(name,age);
    }
    public void makeSound()
    {
        System.out.println(name+ " barks. And is "+age+" years old.");
    }
}
