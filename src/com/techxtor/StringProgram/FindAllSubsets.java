package com.techxtor.StringProgram;

public class FindAllSubsets {
    public static void main(String[] args) {
        String str = "FUN";
        int index = 0;

        // total possible subsets for string of size n is n*(n+1)/2
        String[] arr = new String[str.length() * (str.length() + 1) / 2];

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
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
