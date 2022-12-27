package com.techxtor.ArrayPrograms;

public class EvenOddElements {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 5, 6, 1, 8, 4, 5};
        printEvenOdd(arr);
    }

    static void printEvenOdd(int arr[]) {
        System.out.println("Even Numbers:");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("Odd Numbers:");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
