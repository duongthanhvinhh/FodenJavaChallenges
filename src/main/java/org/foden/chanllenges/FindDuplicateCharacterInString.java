package org.foden.chanllenges;

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
//            if (!output.containsKey(input.charAt(i))){
//                output.put(input.charAt(i), 1);
//            } else {
//                output.put(input.charAt(i), output.get(input.charAt(i)) + 1);
//            }
        }

        //Use remove inside the for loop will cause the ConcurrentModificationException
//        for (Map.Entry<Character, Integer> entry : output.entrySet()){
//            if (entry.getValue() == 1){
//                output.remove(entry.getKey());
//            }
//        }
        output.entrySet().removeIf(entry -> entry.getValue() < 2);
        return output;
    }
}
