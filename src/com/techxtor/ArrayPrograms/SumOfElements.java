package com.techxtor.ArrayPrograms;

import java.util.Arrays;

public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        sumOfElements(arr);
        int[] numbers = {1, 2, 3, 4, 5};

        // Use Java 8 Stream API to sum the elements
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of elements: " + sum);
    }

    static void sumOfElements(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }
        System.out.println("sum of elements of array is " + sum);
    }
}
