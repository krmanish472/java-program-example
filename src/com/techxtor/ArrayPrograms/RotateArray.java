package com.techxtor.ArrayPrograms;

public class RotateArray {
    public static void rightRotate(int[] arr) {
        int lastElement = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
    }

    public static void leftRotate(int[] arr) {
        int firstElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int numberOfRotation = 3;
        for (int i = 0; i < numberOfRotation; i++) {
//            rightRotate(arr);
            leftRotate(arr);
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
