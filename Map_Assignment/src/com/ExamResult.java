package com;
import java.util.*;

public class ExamResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            Map<String, Map<String, Integer>> data = new HashMap<>();

            System.out.print("Enter number of subjects: ");
            int subjects = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < subjects; i++) {
                System.out.print("\nEnter subject name: ");
                String subject = sc.nextLine();

                System.out.print("Enter number of students: ");
                int students = sc.nextInt();
                sc.nextLine();

                Map<String, Integer> studentMarks = new HashMap<>();

                for (int j = 0; j < students; j++) {
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();
                    sc.nextLine();

                    studentMarks.put(name, marks);
                }

                data.put(subject, studentMarks);
            }

            System.out.println("\n================ RESULTS ================\n");

            System.out.println("Top Scorers:");
            for (String subject : data.keySet()) {

                Map<String, Integer> studentsMap = data.get(subject);

                String topper = null;
                int maxMarks = Integer.MIN_VALUE;

                for (Map.Entry<String, Integer> entry : studentsMap.entrySet()) {
                    if (entry.getValue() > maxMarks) {
                        maxMarks = entry.getValue();
                        topper = entry.getKey();
                    }
                }

                System.out.println(subject + " → " + topper + " (" + maxMarks + ")");
            }

            System.out.println("\nAverage Scores:");
            for (String subject : data.keySet()) {

                Map<String, Integer> studentsMap = data.get(subject);

                int sum = 0;
                int count = 0;

                for (int marks : studentsMap.values()) {
                    sum += marks;
                    count++;
                }

                double avg = (double) sum / count;

                System.out.println(subject + " → " + avg);
            }

            System.out.println("\nSubjects with at least one score > 90:");

            for (String subject : data.keySet()) {

                boolean found = false;

                for (int marks : data.get(subject).values()) {
                    if (marks > 90) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    System.out.println(subject);
                }
            }
    }
}
