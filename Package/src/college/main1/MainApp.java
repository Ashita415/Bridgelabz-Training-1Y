package college.main1;

import college.student1.*;
import college.faculty1.*;
import college.department1.*;
import static java.lang.System.out;

public class MainApp {

    public static void main(String[] args) {

        out.println("---- College Management System ----");

        Student s = new Student();
        s.inputStudent();

        Faculty f = new Faculty();
        f.inputFaculty();

        Department d = new Department();
        d.inputDepartment();

        out.println("\n---- College Information ----");
        out.println(s.getDetails());
        out.println(f.getDetails());
        out.println(d.getDetails());
    }
}