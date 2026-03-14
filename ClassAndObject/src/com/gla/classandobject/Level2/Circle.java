package com.gla.classandobject.Level2;
import java.util.Scanner;

class Circle {
    double radius;

    Circle() {
        this(1);
    }

    Circle(double r) {
        radius = r;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);
        c.display();
        sc.close();
    }
}
