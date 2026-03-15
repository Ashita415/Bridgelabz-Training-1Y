package college.department1;

import java.util.Scanner;

public class Department {

    private String deptName;
    private int totalFaculty;
    private int totalStudents;

    public void inputDepartment() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Department Name: ");
        deptName = sc.nextLine();
        System.out.print("Enter Total Faculty: ");
        totalFaculty = sc.nextInt();
        System.out.print("Enter Total Students: ");
        totalStudents = sc.nextInt();
    }

    public String getDetails() {
        return "Department: " + deptName + ", Total Faculty: " + totalFaculty + ", Total Students: " + totalStudents;
    }
}