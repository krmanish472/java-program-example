package com.techxtor.leetcode.easy;

import java.util.Set;
import java.util.TreeSet;

/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each
unique element appears only once. The relative order of the elements should be kept the same.
Then return the number of unique elements in nums.
Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in
nums initially. The remaining elements of nums are not important as well as the size of nums.

Return k

* */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int size = new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{1, 1, 2});
        System.out.println(size);
    }

    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        // Put set values back in nums [1,2,_____]
        int i = 0;
        for (int num : set) {
            nums[i++] = num;
        }
        return set.size();
    }
}
