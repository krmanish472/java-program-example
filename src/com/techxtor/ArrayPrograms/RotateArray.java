package com.techxtor.ArrayPrograms;

public class RotateArray {
    public static void rightRotate(int[] arr){
        int lastElement = arr[arr.length-1];
        for(int j = arr.length-1; j >0; j--){
            arr[j] = arr[j-1];
        }
        arr[0] = lastElement;
    }

    public static void leftRotate(int[] arr){
        int j;
        int firstElement = arr[0];
        for(j = 0; j < arr.length-1; j++){
            arr[j] = arr[j+1];
        }
        arr[j] = firstElement;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int numberOfRotation = 3;
        for(int i = 0; i < numberOfRotation; i++){
            rightRotate(arr);
            leftRotate(arr);
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
