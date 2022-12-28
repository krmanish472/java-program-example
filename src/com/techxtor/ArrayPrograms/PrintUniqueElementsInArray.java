package com.techxtor.ArrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class PrintUniqueElementsInArray {
    public static void main(String[] args) {
        printUniqueElements();
    }
    static void printUniqueElements(){
        int[] arr = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        System.out.println(map.keySet());
    }
}
