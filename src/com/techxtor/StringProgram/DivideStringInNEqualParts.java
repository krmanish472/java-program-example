package com.techxtor.StringProgram;

public class DivideStringInNEqualParts {
    public static void main(String[] args) {
        String string = "manish";

        int length = string.length();
        int nEqualParts = 3;
        int index = 0;
        int chars = length / nEqualParts;

        // [ma, ni, sh]
        String[] dividedStrings = new String[nEqualParts];

        for (int i = 0; i < length; i = i + chars) {
            String part = string.substring(i, i + chars); // (0, 2)
            dividedStrings[index] = part;
            index++;
        }

        for (String dividedString : dividedStrings) {
            System.out.println(dividedString);
        }

    }
}
