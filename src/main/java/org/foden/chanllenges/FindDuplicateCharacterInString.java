package org.foden.chanllenges;

import java.util.Comparator;
import java.util.HashMap;

public class FindDuplicateCharacterInString {
    public static void main(String[] args) {
        System.out.println(duplicateChars("Fodenden"));
    }

    //Find duplicate character in String
    public static HashMap<Character, Integer> duplicateChars(String input){
        HashMap<Character, Integer> output = new HashMap<>();
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            output.put(c, output.getOrDefault(c, 0) + 1);
        }
        output.entrySet().removeIf(entry -> entry.getValue() < 2);
        return output;
    }
}
