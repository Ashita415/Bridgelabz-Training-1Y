package com.assisted;
public class Truck extends Vehicle {
    int loadCapacity;

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Truck → Speed: " + maxSpeed + ", Fuel: " + fuelType + ", Load Capacity: " + loadCapacity + " tons");
    }
}
