package com.gla.classandobject.Level1;
import java.util.Scanner;

class Circle {

    double radius;

    public Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);
        c.display();

        sc.close();
    }
}
