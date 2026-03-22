package com.assisted;

public class Bird extends Animal{
    Bird(String name,int age){
        super(name,age);
    }
    public void makeSound()
    {
        System.out.println(name+ " chirps. And is "+age+" year old.");
    }
}
