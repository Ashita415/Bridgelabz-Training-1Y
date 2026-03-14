package com.gla.classandobject.Level2;
import java.util.Scanner;

class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName;

    Course(String name, int dur, double f) {
        courseName = name;
        duration = dur;
        fee = f;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " days, Fee: " + fee + ", Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Institute Name: ");
        Course.updateInstituteName(sc.nextLine());

        System.out.print("Enter number of courses: ");
        int n = sc.nextInt();
        sc.nextLine();

        Course[] courses = new Course[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Course Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Duration (days): ");
            int dur = sc.nextInt();
            System.out.print("Enter Fee: ");
            double fee = sc.nextDouble();
            sc.nextLine();

            courses[i] = new Course(name, dur, fee);
        }

        System.out.println("\nCourse Details:");
        for (Course c : courses) {
            c.displayCourseDetails();
        }

        System.out.print("\nUpdate Institute Name: ");
        Course.updateInstituteName(sc.nextLine());

        System.out.println("\nUpdated Course Details:");
        for (Course c : courses) {
            c.displayCourseDetails();
        }
        sc.close();
    }
}
