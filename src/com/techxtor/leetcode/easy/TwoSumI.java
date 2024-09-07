package com.techxtor.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

*/
public class TwoSumI {
    public static void main(String[] args) {
        int[] num1 = {2,7,11,15};
        int[] arr = twoSum(num1, 9);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the number and its index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i]; // Find the remainder
            // If the complement exists in the map, return the indices
            if (map.containsKey(remainder)) {
                return new int[] { map.get(remainder), i };
            }
            // Otherwise, store the number and its index in the map
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
