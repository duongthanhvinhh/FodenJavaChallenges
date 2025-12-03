package org.foden.chanllenges;

import java.util.HashMap;

public class CountVowelsAndConsonantsInString {

    public static void main(String[] args) {
        System.out.println(countVowelAndConsonant("ueoaif").get("Vowels"));
        System.out.println(countVowelAndConsonant("ueoif").get("Vowels"));
        System.out.println(countVowelAndConsonantSecondWay("foden").get("Consonants"));
    }

    private static HashMap<String, Integer> countVowelAndConsonant(String input){
        input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int vowels = 0;
        int consonants = 0;
        char[] charArray = input.toCharArray();
        for (char c : charArray) {
            if ((c == 'u') || (c == 'e') || (c == 'o') || (c == 'a') || (c == 'i')) {
                vowels++;
            } else {
                consonants++;
            }
        }
        HashMap<String, Integer> vowelsAndConsonants = new HashMap<>();
        vowelsAndConsonants.put("Vowels", vowels);
        vowelsAndConsonants.put("Consonants", consonants);
        return vowelsAndConsonants;
    }

    private static HashMap<String, Integer> countVowelAndConsonantSecondWay(String input){
        input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for (char c : input.toCharArray()) {
            if ("ueoai".indexOf(c) != -1) {
                vowels++;
            } else {
                consonants++;
            }
        }
        HashMap<String, Integer> vowelsAndConsonants = new HashMap<>();
        vowelsAndConsonants.put("Vowels", vowels);
        vowelsAndConsonants.put("Consonants", consonants);
        return vowelsAndConsonants;
    }
}
