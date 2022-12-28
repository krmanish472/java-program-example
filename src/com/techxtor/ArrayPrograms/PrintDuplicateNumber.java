package com.techxtor.ArrayPrograms;

import java.util.*;

public class PrintDuplicateNumber {
    public static void main(String[] args) {
        printDuplicateNum();
    }

    static void printDuplicateNum() {
        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1, 8};
        Map<Integer, Integer> integerFrequency = new HashMap<>();
        for (int num : arr) {
            if (!integerFrequency.containsKey(num)) {
                integerFrequency.put(num, 1);
            } else {
                int count = integerFrequency.get(num);
                integerFrequency.put(num, count + 1);
            }
        }

//        Set<Map.Entry<Integer, Integer>> entries = integerFrequency.entrySet();
        for (Map.Entry<Integer, Integer> entry : integerFrequency.entrySet()) {
            if (entry.getValue().equals(2)) {
                System.out.print(entry.getKey() + " ");
            }
        }
        /*for (int key : integerFrequency.keySet()) {
            if (key == 2) {
                int value = integerFrequency.get(key);
                System.out.print(value + " ");
            }
        }*/
    }
}
