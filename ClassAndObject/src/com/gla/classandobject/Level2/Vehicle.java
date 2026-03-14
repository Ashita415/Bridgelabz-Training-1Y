package com.gla.classandobject.Level2;
import java.util.Scanner;

class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee;

    Vehicle(String owner, String type) {
        ownerName = owner;
        vehicleType = type;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType + ", Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Registration Fee: ");
        Vehicle.updateRegistrationFee(sc.nextDouble());
        sc.nextLine();

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();
        sc.nextLine();

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Owner Name: ");
            String owner = sc.nextLine();
            System.out.print("Enter Vehicle Type: ");
            String type = sc.nextLine();

            vehicles[i] = new Vehicle(owner, type);
        }

        System.out.println("\nVehicle Details:");
        for (Vehicle v : vehicles) {
            v.displayVehicleDetails();
        }

        System.out.print("\nUpdate Registration Fee: ");
        Vehicle.updateRegistrationFee(sc.nextDouble());

        System.out.println("\nUpdated Vehicle Details:");
        for (Vehicle v : vehicles) {
            v.displayVehicleDetails();
        }
        sc.close();
    }
}
