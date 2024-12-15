package com.techxtor.NumberPrograms;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(checkForPerfectSquare(49));
    }

    static boolean checkForPerfectSquare(double number) {
        double sqrt = Math.sqrt(number);
        return ((sqrt) - Math.floor(sqrt) == 0);
    }
}
