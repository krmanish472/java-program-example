package com.techxtor.StringProgram;

import java.util.Arrays;

public class ConvertCharArrayToString {
    public static void main(String[] args) {
        char[] arr = {'M', 'A', 'N', 'I', 'S', 'H'};

        String s1 = new String(arr);
        System.out.println(s1);

        String s3 = String.valueOf(arr);
        System.out.println(s3);
    }
}
