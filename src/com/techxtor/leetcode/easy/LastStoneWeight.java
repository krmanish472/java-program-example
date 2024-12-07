package com.techxtor.leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
You are given an array of integers stones where stones[i] is the weight of the ith stone.
We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together.
Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

If x == y, both stones are destroyed, and
If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
At the end of the game, there is at most one stone left.

Return the weight of the last remaining stone. If there are no stones left, return 0.

* */
public class LastStoneWeight {
    public static void main(String[] args) {
        int last_Stone_Weight = lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1});
        System.out.println(last_Stone_Weight);
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone: stones){
            pq.add(stone);
        }
        // There should at least be 2 elements in array
        while (pq.size() > 1) {
            pq.add(pq.poll() - pq.poll());
        }
        return pq.poll();
    }
}
