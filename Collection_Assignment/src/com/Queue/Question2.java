package com.Queue;
import java.util.*;

public class Question2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter N: ");
            int n = sc.nextInt();
            generateBinary(n);

        }

        public static void generateBinary(int n) {
            Queue<String> q = new LinkedList<>();
            q.add("1");

            for (int i = 0; i < n; i++) {
                String current = q.remove();
                System.out.print(current + " ");

                q.add(current + "0");
                q.add(current + "1");
            }
        }
    }
