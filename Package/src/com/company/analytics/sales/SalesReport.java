package com.company.analytics.sales;

import java.util.Scanner;

public class SalesReport {

    public void showSalesReport() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter North Region Sales: ");
        int north = sc.nextInt();

        System.out.print("Enter South Region Sales: ");
        int south = sc.nextInt();

        System.out.print("Enter East Region Sales: ");
        int east = sc.nextInt();

        System.out.print("Enter West Region Sales: ");
        int west = sc.nextInt();

        System.out.println("\nSales Report");
        System.out.println("North Region: " + north);
        System.out.println("South Region: " + south);
        System.out.println("East Region: " + east);
        System.out.println("West Region: " + west);
    }
}