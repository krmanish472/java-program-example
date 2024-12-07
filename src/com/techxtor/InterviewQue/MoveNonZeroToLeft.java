package com.techxtor.InterviewQue;

public class MoveNonZeroToLeft {

    public static void moveNonZeroesToStart(int[] arr) {
        int nonZeroIndex = 0; // Pointer for placing non-zero elements

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap non-zero element with the element at nonZeroIndex
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12};
        moveNonZeroesToStart(array);

        // Print the result
        for (int num : array) {
            System.out.print(num + " ");
        }
        // Output: [1, 3, 12, 0, 0]
    }

}
