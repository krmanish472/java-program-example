package com.techxtor.InterviewQue;

public class MoveNonZeroToLeft {

    public static void main(String[] args) {
        int[] array = {1, 0, 0, 2, 3, 0};
        moveNonZeroesToStart_Left(array);
        System.out.println("Non-Zero to Start/Left");
        for (int num : array) {
            System.out.print(num + " ");
        }

        moveNonZeroesToEnd_Right(array);
        System.out.println("Non-Zero to End/Right");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // input: [1, 0, 0, 2, 3, 0]
    // output: [1, 2, 3, 0, 0, 0]
    public static void moveNonZeroesToStart_Left(int[] arr) { // i.e. Move Non-Zeros To Start_Left
        int initialIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[initialIndex];
                arr[initialIndex] = arr[i];
                arr[i] = temp;
                initialIndex++;
            }
        }
    }

    // input: [1, 0, 0, 2, 3, 0]
    // output: [0, 0, 0, 1, 2, 3]
    public static void moveNonZeroesToEnd_Right(int[] arr) { // i.e. Move Zeros To Start_Left
        int initialIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[initialIndex];
                arr[initialIndex] = arr[i];
                arr[i] = temp;
                initialIndex++;
            }
        }
    }
}
