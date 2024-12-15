package com.techxtor.StringProgram;

public class DivideStringInNEqualParts {

    // Example uses 3 equal parts
    public static void main(String[] args) {
        String string = "manish";
        int nEqualParts = 3;

        String[] dividedStrings = new String[nEqualParts]; // [ma, ni, sh]

        int index = 0;
        int eachPartLength = string.length() / nEqualParts;

        for (int i = 0; i < string.length(); i = i + eachPartLength) {
            String part = string.substring(i, i + eachPartLength); // (0, 2)
            dividedStrings[index] = part;
            index++;
        }

        for (String dividedString : dividedStrings) {
            System.out.println(dividedString);
        }

    }
}
