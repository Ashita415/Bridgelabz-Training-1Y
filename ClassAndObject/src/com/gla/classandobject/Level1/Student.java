package com.gla.classandobject.Level1;
import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    int marks;
    char grade;

    void calculateGrade() {
        if (marks >= 90)
            grade = 'A';
        else if (marks >= 75)
            grade = 'B';
        else if (marks >= 60)
            grade = 'C';
        else if (marks >= 50)
            grade = 'D';
        else
            grade = 'F';
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        s.rollNumber = sc.nextInt();

        System.out.print("Enter Marks: ");
        s.marks = sc.nextInt();

        s.calculateGrade();

        System.out.println("\nStudent Details:");
        s.displayDetails();

        sc.close();
    }
}