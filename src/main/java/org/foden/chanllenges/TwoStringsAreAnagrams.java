package org.foden.chanllenges;

import java.util.Arrays;

public class TwoStringsAreAnagrams {

    public static boolean areTwoStringsAnagrams(String str1, String str2){
        if (str1.length() != str2.length()) return false;
        char[] charArrayStr1 = str1.toLowerCase().toCharArray();
        char[] charArrayStr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(charArrayStr1);
        Arrays.sort(charArrayStr2);
        for (int i = 0; i < charArrayStr1.length; i++){
            if (charArrayStr1[i] != charArrayStr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areTwoStringsAnagrams("Foden", "odenf"));
    }
}
