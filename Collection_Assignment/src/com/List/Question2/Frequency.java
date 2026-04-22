package com.List.Question2;
import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<String> list = new ArrayList<>();
        System.out.print("Enter strings:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }


        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String str : list) {
            if (frequencyMap.containsKey(str)) {
                frequencyMap.put(str, frequencyMap.get(str) + 1);
            } else {
                frequencyMap.put(str, 1);
            }
        }
        System.out.println("Frequency of elements:");
        System.out.println(frequencyMap);
    }
}
