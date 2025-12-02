package org.foden.chanllenges;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfWordsInString {

    public static void countNumberOfWords(String str){

        String[] words =  str.split(" ");
        HashMap<String, Integer> wordsHashMap = new HashMap<>();
        for (int i = 0; i <= words.length - 1; i++){
            if (wordsHashMap.containsKey(words[i])){
                int count = wordsHashMap.get(words[i]) + 1;
                wordsHashMap.put(words[i], count);
            } else wordsHashMap.put(words[i], 1);
        }
        for (Map.Entry<String, Integer> entry : wordsHashMap.entrySet()){
            System.out.println(entry);
        }
    }

    public static void count(String str){

        String[] splitStr = str.split(" ");
        HashMap<String, Integer> words = new HashMap<>();
        for (int i = 0; i < splitStr.length; i++){
            if (words.containsKey(splitStr[i])){
                int count = words.get(splitStr[i]) + 1;
                words.put(splitStr[i], count);
            } else words.put(splitStr[i], 1);
        }
        for (Map.Entry<String, Integer> entry : words.entrySet()){
            System.out.println(entry);
        }
    }

    public static void main(String[] args) {
        countNumberOfWords("This is a program of Foden , Foden is an automation tester.");
        count("Foden is an Automation Foden Foden oden an an an");
    }
}
