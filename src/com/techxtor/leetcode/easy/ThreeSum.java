package com.techxtor.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

Example 2:
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.

* */
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> triplets = threeSum(nums);
        System.out.println("Triplets that sum up to zero are: " + triplets);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums); //[-4, -1, -1, 0, 1, 2]
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left_pointer = i + 1;
            int right_pointer = nums.length - 1;

            while (left_pointer < right_pointer) {
                int sum = nums[i] + nums[left_pointer] + nums[right_pointer];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left_pointer], nums[right_pointer]));
                    // Skip duplicate elements
                    while (left_pointer < right_pointer && nums[left_pointer] == nums[left_pointer + 1]) {
                        left_pointer++;
                    }
                    while (left_pointer < right_pointer && nums[right_pointer] == nums[right_pointer - 1]) {
                        right_pointer--;
                    }
                    left_pointer++;
                    right_pointer--;
                } else if (sum < 0) {
                    left_pointer++;
                } else {
                    right_pointer--;
                }
            }
        }

        return result;
    }
}
