package com.university.department.cse;

public class Course {

    String courseName;
    int courseCode;

    public void setCourse(String name, int code) {
        courseName = name;
        courseCode = code;
    }

    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }
}
