package com.techxtor.ArrayPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintUniqueElementsInArray {
    public static void main(String[] args) {
        printUniqueElements();
    }
    static void printUniqueElements(){
        int[] arr = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };

        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : arr) {
            uniqueElements.add(num);
        }

        System.out.println("Unique elements in the array are: " + uniqueElements);
    }
}
