package com.gla.classandobject.Level1;
import java.util.*;

// Program to Display Employee Details
// Problem Statement: Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.

public class Employee {
    String name;
    int id;
    double salary;

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter Employee Name: ");
        emp.name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        emp.id = sc.nextInt();

        System.out.print("Enter Employee Salary: ");
        emp.salary = sc.nextDouble();

        System.out.println("\nEmployee Details:");
        emp.displayDetails();

    }
}
