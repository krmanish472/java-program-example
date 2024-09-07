package com.techxtor.leetcode.easy;

public class BuySellStocksI {
    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices) {
        int totalProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                totalProfit = Math.max(totalProfit, prices[j] - prices[i]);
            }
        }
        return totalProfit;
    }
}
