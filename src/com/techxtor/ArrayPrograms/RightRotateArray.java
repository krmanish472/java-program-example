package com.techxtor.ArrayPrograms;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int numberOfRotation = 3;
        for(int i = 0; i < numberOfRotation; i++){
            int lastElement = arr[arr.length-1];
            for(int j = arr.length-1; j >0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = lastElement;
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
