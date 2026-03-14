package com.gla.methods.Level3;
import java.util.Scanner;
public class Students {
    public static int[][] generateMarks(int n) {

        int marks[][] = new int[n][3];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 3; j++) {

                marks[i][j] = (int)(Math.random() * 90) + 10;

            }
        }

        return marks;
    }
    public static double[][] calculateResult(int marks[][]) {

        int n = marks.length;
        double result[][] = new double[n][3];
        for(int i = 0; i < n; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];

            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            average = Math.round(average * 100) / 100.0;
            percentage = Math.round(percentage * 100) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }
    public static void display(int marks[][], double result[][]) {

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPercent");

        for(int i = 0; i < marks.length; i++) {

            System.out.println((i+1) + "\t" +
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t" +
                    marks[i][2] + "\t" +
                    result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int marks[][] = generateMarks(n);
        double result[][] = calculateResult(marks);

        display(marks, result);
    }
}
