package com.techxtor.ArrayPrograms;

public class PrintThirdLargestNumberInUniqueArray {
    public static void main(String[] args) {
        int[] arr = {100, 14, 46, 47, 98, 32, 150, 35, 98, 52, 110};
        var reverseArray = ReverseSortArray.sortArrayInDescOrder(arr);
        System.out.println("\n" + reverseArray[2]);
    }
}
