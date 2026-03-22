package com.assisted;
public class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Car → Speed: " + maxSpeed + ", Fuel: " + fuelType + ", Seats: " + seatCapacity);
    }
}
