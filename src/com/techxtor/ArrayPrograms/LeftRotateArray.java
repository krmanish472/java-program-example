package com.techxtor.ArrayPrograms;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int numberOfRotation = 3;
        for(int i = 0; i < numberOfRotation; i++){
            int j = 0;
            int firstElement = arr[0];
            for(j = 0; j < arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = firstElement;
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
