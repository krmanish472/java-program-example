package com.techxtor.ArrayPrograms;

public class FindFirstNonRepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {9, 4, 9, 6, 7, 4};

        for (int i = 0; i < arr.length; i++) {
            boolean unique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
