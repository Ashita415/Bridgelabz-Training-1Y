package com.school.main;

import java.util.Scanner;
import com.school.data.*;
import com.school.util.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter student name: ");
        s.setName(sc.nextLine());

        System.out.print("Enter marks of subject 1: ");
        s.setMark1(sc.nextInt());

        System.out.print("Enter marks of subject 2: ");
        s.setMark2(sc.nextInt());

        System.out.print("Enter marks of subject 3: ");
        s.setMark3(sc.nextInt());

        Analyzer a = new Analyzer();

        double avg = a.calculateAverage(s);
        String grade = a.findGrade(avg);

        System.out.println("\n" + s.toString());
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}
