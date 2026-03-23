package com.implementing;
public class Runner {
    public static void main(String[] args) {
        SmartDevice device1 = new Light();
        SmartDevice device2 = new AC();
        SmartDevice device3 = new TV();

        device1.turnOn();
        device2.turnOn();
        device3.turnOn();

        device1.turnOff();
        device2.turnOff();
        device3.turnOff();
    }
}
