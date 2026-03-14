package com.gla.classandobject.Level2;
import java.util.Scanner;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    int costPerDay = 1000;

    CarRental() {}
    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    int calculateCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println(customerName + " " + carModel + " " + rentalDays);
        System.out.println("Total Cost: " + calculateCost());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String c = sc.nextLine();
        System.out.print("Enter Car Model: ");
        String m = sc.nextLine();
        System.out.print("Enter Rental Days: ");
        int d = sc.nextInt();

        CarRental rental = new CarRental(c, m, d);
        rental.display();
        sc.close();
    }
}