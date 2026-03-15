package college.student;
public class Student {

    String name;
    int roll;

    public void getStudent(String n, int r) {
        name = n;
        roll = r;
    }

    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + roll);
    }
}
