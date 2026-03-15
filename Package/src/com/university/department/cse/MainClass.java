package com.university.department.cse;
import com.university.department.cse.Course;
import java.util.*;
public class MainClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Course Name: ");
        String cname = sc.nextLine();

        System.out.print("Enter Course Code: ");
        int ccode = sc.nextInt();

        Course course = new Course();
        course.setCourse(cname, ccode);

        System.out.println("\n--- Course Details ---");
        course.displayCourse();
    }
}
