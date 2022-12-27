package com.techxtor.NumberPrograms;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(checkForPerfectSquare(49));
    }

    static boolean checkForPerfectSquare(double number) {
        double squrt = Math.sqrt(number);
        return ((squrt) - Math.floor(squrt) == 0);
    }
}
