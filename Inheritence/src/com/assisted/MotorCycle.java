package com.assisted;
class Motorcycle extends Vehicle {
    boolean hasHelmet;

    Motorcycle(int maxSpeed, String fuelType, boolean hasHelmet) {
        super(maxSpeed, fuelType);
        this.hasHelmet = hasHelmet;
    }

    @Override
    void displayInfo() {
        System.out.println("Motorcycle → Speed: " + maxSpeed + ", Fuel: " + fuelType + ", Helmet Available: " + hasHelmet);
    }
}
