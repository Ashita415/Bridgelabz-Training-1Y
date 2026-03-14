package com.gla.classandobject.Level2;
import java.util.Scanner;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double c) {
        CGPA = c;
    }

    public double getCGPA() {
        return CGPA;
    }

    void display() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    void displayProtected() {
        System.out.println("Accessing protected Name from subclass: " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PostgraduateStudent pg = new PostgraduateStudent();

        System.out.print("Enter Roll Number: ");
        pg.rollNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        pg.name = sc.nextLine();
        System.out.print("Enter CGPA: ");
        pg.setCGPA(sc.nextDouble());

        pg.display();
        pg.displayProtected();
        sc.close();
    }
}
