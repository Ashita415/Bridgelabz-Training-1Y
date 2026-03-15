package college;
import college.student.Student;
import college.faculty.Faculty;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String sname = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Faculty Name: ");
        String fname = sc.nextLine();

        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();

        Student s = new Student();
        s.getStudent(sname, roll);

        Faculty f = new Faculty();
        f.getFaculty(fname, subject);

        System.out.println("\nDetails:");
        s.displayStudent();
        f.displayFaculty();
    }
}
