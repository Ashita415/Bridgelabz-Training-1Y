package com.CollegeAdmission;
import java.util.*;

public class Runner {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            List<Student> applicants = new ArrayList<>();

            System.out.print("Enter number of applicants: ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter ID, Name, Marks: ");
                int id = sc.nextInt();
                sc.nextLine();
                String name = sc.nextLine();
                double marks = sc.nextDouble();

                applicants.add(new Student(id, name, marks));
            }

            Set<Student> shortlisted = new HashSet<>();
            for (Student s : applicants) {
                if (s.marks >= 50) {
                    shortlisted.add(s);
                }
            }

            System.out.println("\nShortlisted Students:");
            for (Student s : shortlisted) {
                System.out.println(s);
            }

            Queue<Student> interviewQueue = new LinkedList<>(shortlisted);

            System.out.println("\nInterview Process:");
            List<Student> selected = new ArrayList<>();

            while (!interviewQueue.isEmpty()) {
                Student s = interviewQueue.poll();
                System.out.println("Interviewing: " + s.name);
                if (s.marks >= 60) {
                    selected.add(s);
                }
            }


            TreeSet<Student> meritList = new TreeSet<>(
                    (a, b) -> {
                        if (b.marks != a.marks)
                            return Double.compare(b.marks, a.marks);
                        else
                            return a.id - b.id;
                    }
            );

            meritList.addAll(selected);

            System.out.println("\nFinal Merit List:");
            for (Student s : meritList) {
                System.out.println(s);
            }

        }
}
