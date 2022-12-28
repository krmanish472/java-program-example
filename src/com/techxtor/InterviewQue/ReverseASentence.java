package com.techxtor.InterviewQue;

public class ReverseASentence {
    public static void main(String[] args) {
        String str = "Hello World! How are you :)";
        String str1 = " Hello";

        reverseSentence(str);
        System.out.println();
        reverseSentence(str1);
    }

    static void reverseSentence(String str) {
        String[] arr = str.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
