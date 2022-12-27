package com.techxtor.StringProgram;

public class CountVowelAndConsonants {
    public static void main(String[] args) {
        String str = "Manisha";
        int vowelCount = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u') {
                vowelCount++;
            }
        }
        System.out.println("vowel count is " + vowelCount);
        System.out.println("consonant count is " + (str.length() - vowelCount));
    }
}
