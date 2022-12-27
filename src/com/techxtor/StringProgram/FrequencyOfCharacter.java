package com.techxtor.StringProgram;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        Map<Character, Integer> characterFreq = new HashMap<>();
        String str = "picture perfect But now CAPITAL :)";

        for (int i = 0; i < str.length(); i++) {
            if (!characterFreq.containsKey(str.charAt(i))) {
                characterFreq.put(str.charAt(i), 1);
            } else {
                int count = characterFreq.get(str.charAt(i));
                characterFreq.put(str.charAt(i), count + 1);
            }
        }

        System.out.println(characterFreq);
    }
}
