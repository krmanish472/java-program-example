package com.techxtor.StringProgram;

import java.util.regex.Pattern;

public class HasSpecialCharacter {
    public static void main(String[] args) {
        String str1 = "!#$GeeeksforGeeks.Computer.Science.Portal!!"; // YES
        String str2 = "Hello World"; // NO
        String str3 = "24Hours"; // NO

        if (hasSpecialCharacter(str1)) {
            System.out.println(str1 + " contains special characters");
        }

        if (hasSpecialCharacter(str2)) {
            System.out.println(str2 + " does not contains special characters");
        }

        if (hasSpecialCharacter(str3)) {
            System.out.println(str3 + " does not contains special characters");
        }
    }

    static boolean hasSpecialCharacter(String string) {
        Pattern characterPattern = Pattern.compile(
                "[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        return characterPattern.matcher(string).find();
    }
}
