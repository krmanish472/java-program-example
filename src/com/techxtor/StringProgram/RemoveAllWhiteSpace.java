package com.techxtor.StringProgram;

public class RemoveAllWhiteSpace {
    public static void main(String[] args) {
        String s = " Cognizant Interview";
        s = s.replaceAll("\\s", "");
        System.out.println(s);
    }
}

class RemoveFirstAndLastSpace {
    public static void main(String[] args) {
        String str = "      Manish Kumar ";
        str = str.replaceAll("^\\s+|\\s+$", "");
        System.out.println(str);
    }
}

/* Understanding Regex:
^ -> marks start
\ -> escape char
\s -> look for whitespace character
+ -> any frequency
| -> and/or
$ -> marks end
* */
