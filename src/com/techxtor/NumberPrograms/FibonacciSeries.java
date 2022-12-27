package com.techxtor.NumberPrograms;

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
public class FibonacciSeries {
    public static void main(String[] args) {
        int[] fibonacciArray = printFibonacciSeries();
        for (int i : fibonacciArray) {
            System.out.print(i + " ");
        }

        // without array and just variable
        System.out.println(".....#####.....");
        printFibonacciSeriesWithoutArray();
    }

    private static int[] printFibonacciSeries() {
        int[] fibonacciArray = new int[10];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;

        for (int i = 2; i < fibonacciArray.length; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
        return fibonacciArray;
    }

    static void printFibonacciSeriesWithoutArray() {
        int a = 0, b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 2; i < 10; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
