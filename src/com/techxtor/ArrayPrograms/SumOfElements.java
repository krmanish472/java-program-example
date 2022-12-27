package com.techxtor.ArrayPrograms;

public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        sumOfElements(arr);
    }

    static void sumOfElements(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }
        System.out.println("sum of elements of array is " + sum);
    }
}
