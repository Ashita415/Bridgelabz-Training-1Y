package com.Queue;
import java.util.*;

public class Question1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Queue<Integer> queue = new LinkedList<>();

            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                queue.add(sc.nextInt());
            }

            reverseQueue(queue);

            System.out.println("Reversed Queue: " + queue);
            sc.close();
        }

        public static void reverseQueue(Queue<Integer> q) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int x = q.remove();
                for (int j = 0; j < size - i - 1; j++) {
                    q.add(q.remove());
                }

                q.add(x);
            }
        }
    }
