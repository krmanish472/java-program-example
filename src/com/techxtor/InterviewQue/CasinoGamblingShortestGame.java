package com.techxtor.InterviewQue;

public class CasinoGamblingShortestGame {
    public static void main(String[] args) {
        countShortestGame(18, 2);
        countShortestGame(10, 10);
        countShortestGame(8, 0);
    }

    // N = 18 => Total Coin number
    // K = 2 => only twice, we can bet all

    static void countShortestGame(int N, int K) {
        int count = 0;
        while (N != 1) {
            if (N % 2 == 0 && K != 0) {
                N = N / 2;
                K = K - 1;
            } else {
                N = N - 1;
            }
            count++;
        }
        System.out.println(count);
    }

}
