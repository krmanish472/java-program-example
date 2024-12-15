package com.techxtor.InterviewQue;

import java.util.StringJoiner;

public class ReverseASentence {
    public static void main(String[] args) {
        String str = "Hello World! How are you :)";
        reverseSentence(str);
    }

    static void reverseSentence(String str) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        String[] arr = str.split(" ");

        // Start the loop from last word
        for (int i = arr.length - 1; i >= 0; i--) {
            stringJoiner.add(arr[i]);
        }
        System.out.println(stringJoiner);
    }
}
