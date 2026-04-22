package com.Question2;
import java.util.Arrays;
import java.util.List;

public class Hospital {
    public static void printId(String id) {
            System.out.println("Patient ID: " + id);
        }

        public static void main(String[] args) {
        List<String> patientIds = Arrays.asList("P101", "P102", "P103", "P104");
            patientIds.forEach(Hospital::printId);
        }
    }
