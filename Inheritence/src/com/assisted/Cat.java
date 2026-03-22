package com.assisted;

public class Cat extends Animal {
    Cat(String name,int age){
        super(name,age);
    }
    public void makeSound()
    {
        System.out.println(name+ " meows. And is "+age+" years old.");
    }
}
