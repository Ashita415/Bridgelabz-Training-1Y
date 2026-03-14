package com.gla.classandobject.Level2;
import java.util.Scanner;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    void display() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    void displayProtected() {
        System.out.println("Accessing protected Department from subclass: " + department);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager m = new Manager();

        System.out.print("Enter Employee ID: ");
        m.employeeID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department: ");
        m.department = sc.nextLine();
        System.out.print("Enter Salary: ");
        m.setSalary(sc.nextDouble());

        m.display();
        m.displayProtected();
        sc.close();
    }
}
