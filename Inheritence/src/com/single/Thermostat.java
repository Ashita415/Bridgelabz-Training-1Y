package com.single;
class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        System.out.println("Device ID: " + deviceId +
                ", Status: " + status +
                ", Temperature: " + temperatureSetting + "°C");
    }
}
