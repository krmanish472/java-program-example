package com.techxtor.ArrayPrograms;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {100, 14, 46, 47, 98, 32, 110, 150, 35, 98, 52, 110, 100};
        sortArrayInAscOrder(arr);
        System.out.println();
        sortArrayInDescOrder(arr);
    }

    static void sortArrayInAscOrder(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;;
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void sortArrayInDescOrder(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
