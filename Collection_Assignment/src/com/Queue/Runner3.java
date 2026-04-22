package com.Queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Runner3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            PriorityQueue<Question3> pq = new PriorityQueue<>(
                    (a, b) -> b.severity - a.severity
            );

            System.out.print("Enter number of patients: ");
            int n = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter patient name and severity:");
            for (int i = 0; i < n; i++) {
                String name = sc.nextLine();
                int severity = sc.nextInt();
                sc.nextLine();

                pq.add(new Question3(name, severity));
            }

            System.out.println("Treatment Order:");
            while (!pq.isEmpty()) {
                Question3 p = pq.remove();
                System.out.println(p.name + " (Severity: " + p.severity + ")");
            }
            
        }
    }
