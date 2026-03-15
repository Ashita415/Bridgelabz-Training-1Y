package com.company.analytics.hr;

import java.util.Scanner;

public class EmployeeReport {

    public void showEmployeeReport() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Performance Rating: ");
        String rating = sc.nextLine();

        System.out.println("\nEmployee Performance Report");
        System.out.println("Employee: " + name);
        System.out.println("Performance: " + rating);
    }
}