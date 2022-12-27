package com.techxtor.NumberPrograms;

public class PrimeNumber {
    public static void main(String[] args) {
        isPrime(23);
    }

    static void isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count > 2) {
                System.out.println("number is not prime");
                break;
            }
        }
        if(count == 2){
            System.out.println("number is prime");
        }
    }
}

// 2, 3, 5, 7, 11, 13, 17 => number that has only 2 factor => 1 and number itself
