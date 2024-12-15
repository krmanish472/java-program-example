package com.techxtor.Miscellaneous;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {2, 5, 3, 6}; // Example denominations
        int sum = 10;
        System.out.println(countWays(coins, sum));
    }

    public static int countWays(int[] coins, int sum) {
        int[] dp = new int[sum + 1]; // [X, X, X, X, X]
        dp[0] = 1;

        // Fill the DP array
        for (int coin : coins) {
            for (int i = coin; i <= sum; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[sum];
    }

}
