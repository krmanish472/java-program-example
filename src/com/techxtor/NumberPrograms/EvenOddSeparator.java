package com.techxtor.NumberPrograms;

import java.util.Arrays;

public class EvenOddSeparator {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3, 1};
        System.out.println("Odd to Left: ");
        moveOddToStart_Left(arr);

        System.out.println("Even to Left: ");
        moveOddToEnd_Right(arr);

    }

    static void moveOddToStart_Left(int[] arr) { // i.e. Move Odd To Start_Left
        int initialIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                int temp = arr[initialIndex];
                arr[initialIndex] = arr[i];
                arr[i] = temp;
                initialIndex++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void moveOddToEnd_Right(int[] arr) { // i.e. Move Even To Start_Left
        int initialIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int temp = arr[initialIndex];
                arr[initialIndex] = arr[i];
                arr[i] = temp;
                initialIndex++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
