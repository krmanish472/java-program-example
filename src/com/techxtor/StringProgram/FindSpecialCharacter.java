package com.techxtor.StringProgram;

public class FindSpecialCharacter {

    public static void main(String[] args) {
        int specialCharacterCount = 0;

        String s = "!#$GeeeksforGeeks.Computer.Science.Portal!! Tada";

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)) &&
                    !Character.isLetter(s.charAt(i)) &&
                    !Character.isWhitespace(s.charAt(i))) {
                specialCharacterCount++;
            }
        }
        System.out.println("There are " + specialCharacterCount + " special characters");
    }
}
