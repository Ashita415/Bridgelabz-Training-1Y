package com.gla.Level_2;
import java.util.Scanner;
public class StudentGrade {
    public static int[][] inputMarks(int n) {
            Scanner sc = new Scanner(System.in);
            int[][] marks = new int[n][3];
            for (int i = 0; i < n; i++) {
                System.out.println("Student " + (i + 1));
                System.out.print("Physics: ");
                marks[i][0] = sc.nextInt();
                System.out.print("Chemistry: ");
                marks[i][1] = sc.nextInt();
                System.out.print("Math: ");
                marks[i][2] = sc.nextInt();
            }
            return marks;
        }

        public static double[][] calculateResults(int[][] marks) {
            int n = marks.length;
            double[][] result = new double[n][3];
            for (int i = 0; i < n; i++) {
                int total = marks[i][0] + marks[i][1] + marks[i][2];
                double avg = total / 3.0;
                double per = (total / 300.0) * 100;
                avg = Math.round(avg * 100.0) / 100.0;
                per = Math.round(per * 100.0) / 100.0;
                result[i][0] = total;
                result[i][1] = avg;
                result[i][2] = per;
            }
            return result;
        }

        public static char[] calculateGrades(double[][] result) {
            int n = result.length;
            char[] grades = new char[n];
            for (int i = 0; i < n; i++) {
                double per = result[i][2];
                if (per >= 80)
                    grades[i] = 'A';
                else if (per >= 70)
                    grades[i] = 'B';
                else if (per >= 60)
                    grades[i] = 'C';
                else if (per >= 50)
                    grades[i] = 'D';
                else if (per >= 40)
                    grades[i] = 'E';
                else
                    grades[i] = 'R';
            }
            return grades;
        }

        public static void display(int[][] marks, double[][] result, char[] grades) {
            System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPer\tGrade");
            for (int i = 0; i < marks.length; i++) {
                System.out.println(
                        marks[i][0] + "\t" +
                                marks[i][1] + "\t" +
                                marks[i][2] + "\t" +
                                (int) result[i][0] + "\t" +
                                result[i][1] + "\t" +
                                result[i][2] + "\t" +
                                grades[i]);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of students: ");
            int students = sc.nextInt();
            int[][] marks = inputMarks(students);
            double[][] result = calculateResults(marks);
            char[] grades = calculateGrades(result);
            display(marks, result, grades);
        }
    }