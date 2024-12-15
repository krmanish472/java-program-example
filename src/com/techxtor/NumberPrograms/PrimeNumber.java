package com.techxtor.NumberPrograms;

public class PrimeNumber {
    public static void main(String[] args) {
        isPrime(23);
    }

    // if a number is divisible by 1 and itself only => Prime
    // i.e. Prime will have 2 factors only
    static void isPrime(int n) {
        int factorsCount = 0;

        // loop from 1 to number itself
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factorsCount++;
            }
            if (factorsCount > 2) {
                System.out.println("Number is not prime");
                break;
            }
        }
        if(factorsCount == 2){
            System.out.println("Number is prime");
        }
    }
}
