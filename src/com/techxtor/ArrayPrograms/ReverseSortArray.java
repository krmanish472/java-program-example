package com.techxtor.ArrayPrograms;

import java.util.Arrays;

public class ReverseSortArray {
    public static void main(String[] args) {
        int[] arr = {100, 14, 46, 47, 98, 32, 110, 150, 35, 98, 52, 110, 100};
        sortArrayInDescOrder(arr);
    }

    static int[] sortArrayInDescOrder(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        return arr;
    }
}
