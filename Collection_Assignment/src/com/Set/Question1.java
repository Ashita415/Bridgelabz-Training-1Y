package com.Set;
import java.util.*;

public class Question1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of Set1: ");
            int n1 = sc.nextInt();

            Set<Integer> set1 = new HashSet<>();
            System.out.println("Enter elements of Set1:");
            for (int i = 0; i < n1; i++) {
                set1.add(sc.nextInt());
            }

            System.out.print("Enter size of Set2: ");
            int n2 = sc.nextInt();

            Set<Integer> set2 = new HashSet<>();
            System.out.println("Enter elements of Set2:");
            for (int i = 0; i < n2; i++) {
                set2.add(sc.nextInt());
            }

            if (set1.equals(set2)) {
                System.out.println("Output: true (Sets are equal)");
            } else {
                System.out.println("Output: false (Sets are not equal)");
            }

        }
    }