package com.techxtor.NumberPrograms;

public class FindFactorialOfNumber {
    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }

    // 5! = 5*4*3*2*1
    static int findFactorial(int n) {
        int factorial = 1;
        while (n != 0) {
            factorial = factorial * n;
            n--;
        }
        return factorial;
    }
}

