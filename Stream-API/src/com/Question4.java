package com;
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        List<Double> sensorReadings = Arrays.asList(
                23.5, 45.2, 67.8, 12.3, 89.6, 55.0, 30.4
        );

        double threshold = 50.0;
        sensorReadings.stream()
                .filter(reading -> reading > threshold)
                .forEach(reading ->
                        System.out.println("Alert! High sensor reading: " + reading)
                );
    }
}
