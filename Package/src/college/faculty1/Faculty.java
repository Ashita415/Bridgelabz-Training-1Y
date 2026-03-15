package college.faculty1;

import java.util.Scanner;

public class Faculty {

    private String name;
    private String department;
    private String designation;

    public void inputFaculty() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Faculty Name: ");
        name = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
        System.out.print("Enter Designation: ");
        designation = sc.nextLine();
    }

    public String getDetails() {
        return "Faculty Name: " + name + ", Department: " + department + ", Designation: " + designation;
    }
}