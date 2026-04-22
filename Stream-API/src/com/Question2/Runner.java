package com.Question2;
import java.util.*;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. Mehta", "Cardiology", true),
                new Doctor("Dr. Sharma", "Neurology", false),
                new Doctor("Dr. Gupta", "Orthopedics", true),
                new Doctor("Dr. Khan", "Pediatrics", true),
                new Doctor("Dr. Singh", "Dermatology", false)
        );

        List<Doctor> weekendDoctors = doctors.stream()
                .filter(d -> d.availableOnWeekend)
                .sorted(Comparator.comparing(d -> d.specialty))
                .collect(Collectors.toList());

        weekendDoctors.forEach(System.out::println);
    }
}
