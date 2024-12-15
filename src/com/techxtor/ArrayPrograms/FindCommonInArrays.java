package com.techxtor.ArrayPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonInArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 4, 7, 5, 6};
        findCommonElements(arr1, arr2);
        findCommonElementsUsingStream(arr1, arr2);

    }

    static void findCommonElements(int[] arr1, int[] arr2){
        for (int e1 : arr1) {
            for (int e2 : arr2) {
                if (e1 == e2) {
                    System.out.println(e1);
                }
            }
        }
    }

    static void findCommonElementsUsingStream(int[] arr1, int[] arr2){
        List<Integer> commonList = Arrays.stream(arr1)
                .filter(num1 -> Arrays.stream(arr2).anyMatch(num2 -> num2 == num1))
                .boxed()
                .collect(Collectors.toList());

        System.out.println(commonList);
    }
}