package com.techxtor.InterviewQue;

import java.util.Arrays;

public class MostRepeatingNumberInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 3, 4, 5, 3};
        int mostRepeatingChar = findMostRepeatingChar(arr);
        System.out.println(mostRepeatingChar);
    }

    static int findMostRepeatingChar(int[] arr) {
        Arrays.sort(arr);
        int max_count = 1;
        int res = arr[0];
        int curr_count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else
                curr_count = 1;
            if (curr_count > max_count) {
                max_count = curr_count;
                res = arr[i - 1];
            }
        }
        return res;
    }

}
