package com.List.Question1;
import java.util.*;

public class ReverseList {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            ArrayList<Integer> arrayList = new ArrayList<>();
            System.out.print("Enter elements for ArrayList:");
            for (int i = 0; i < n; i++) {
                arrayList.add(sc.nextInt());
            }


            LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
            reverseArrayList(arrayList);
            System.out.println("Reversed ArrayList: " + arrayList);


            reverseLinkedList(linkedList);
            System.out.println("Reversed LinkedList: " + linkedList);

        }

        public static void reverseArrayList(ArrayList<Integer> list) {
            int left = 0;
            int right = list.size() - 1;

            while (left < right) {
                int temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);

                left++;
                right--;
            }
        }

        public static void reverseLinkedList(LinkedList<Integer> list) {
            int left = 0;
            int right = list.size() - 1;

            while (left < right) {
                int temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);

                left++;
                right--;
            }
        }
    }