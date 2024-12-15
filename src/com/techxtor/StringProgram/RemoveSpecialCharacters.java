package com.techxtor.StringProgram;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String str = "J@av@aPr^ogrammin$gLan@gua)ge?/";
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
    }
}
