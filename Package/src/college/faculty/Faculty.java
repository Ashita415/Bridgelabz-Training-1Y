package college.faculty;
public class Faculty {

    String name;
    String subject;

    public void getFaculty(String n, String s) {
        name = n;
        subject = s;
    }

    public void displayFaculty() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Subject: " + subject);
    }
}
