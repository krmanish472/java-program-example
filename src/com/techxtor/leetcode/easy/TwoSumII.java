package com.techxtor.leetcode.easy;

import java.util.Arrays;

/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers
such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2]
where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.
* */
public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = twoSum(new int[]{2, 7, 11, 15}, 9);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left_pointer = 0;
        int right_pointer = numbers.length - 1;

        while (left_pointer <= right_pointer) {
            int sum = numbers[left_pointer] + numbers[right_pointer];
            if (sum > target) {
                right_pointer--;
            } else if (sum < target) {
                left_pointer++;
            } else {
                return new int[]{left_pointer + 1, right_pointer + 1};
            }
        }
        return new int[]{left_pointer + 1, right_pointer + 1};
    }
}
