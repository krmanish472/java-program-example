package com.techxtor.StringProgram;

/*
 * Input: aabbbbeeeeffggg
 * Output: a2b4e4f2g3
 * */
public class ReduceSizeOfString {
    public static void main(String[] args) {
        String str = "afabbbbeeeeffggg";
        reduceString(str);
    }

    static void reduceString(String str) {
        String uniqueString = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                uniqueString = uniqueString + str.charAt(i);
            }
        }
        for (int i = 0; i < uniqueString.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (uniqueString.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(uniqueString.charAt(i));
            } else {
                System.out.print(uniqueString.charAt(i) + String.valueOf(count));
            }
        }
    }
}
