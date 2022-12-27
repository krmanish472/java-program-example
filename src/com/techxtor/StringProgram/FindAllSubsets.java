package com.techxtor.StringProgram;

public class FindAllSubsets {
    public static void main(String[] args) {
        String str = "FUN";
        int len = str.length();
        int index = 0;

        // total possible subsets for string of size n is n*(n+1)/2
        String[] arr = new String[len * (len + 1) / 2];

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                arr[index] = str.substring(i, j + 1);
                index++;
            }
        }

        System.out.println("All subsets for given string are: ");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
