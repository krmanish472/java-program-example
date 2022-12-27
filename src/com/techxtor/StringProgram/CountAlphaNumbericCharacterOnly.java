package com.techxtor.StringProgram;

public class CountAlphaNumbericCharacterOnly {
    public static void main(String[] args) {
        int specialCharacterAndWhiteSpaceCount = 0;

        String s = "!#$GeeeksforGeeks.Computer.Science.Portal!! Tada";

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)) &&
                    !Character.isLetter(s.charAt(i))) {
                specialCharacterAndWhiteSpaceCount++;
            }
        }
        System.out.println("There are " + (s.length() - specialCharacterAndWhiteSpaceCount) + " alpha-numeric characters");
    }
}
