package college.student1;

import java.util.Scanner;

public class Student {

    private String name;
    private int rollNumber;
    private String course;

    public void inputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course: ");
        course = sc.nextLine();
    }

    public String getDetails() {
        return "Student Name: " + name + ", Roll Number: " + rollNumber + ", Course: " + course;
    }
}