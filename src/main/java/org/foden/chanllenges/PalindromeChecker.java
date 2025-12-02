package org.foden.chanllenges;

public class PalindromeChecker {

    public static boolean isPalindromeUsingWhileLoop(String str){
        if (str.length() < 2) return false;
        int left = 0;
        int right = str.length() - 1;
        while (left < right){
            if (str.charAt(left++) != str.charAt(right--)) return false;
        }
        return true;
    }

    public static boolean isPalindromeAllowOneMismatch(String input){
        if (isStringPalindrome(input)){
            return true;
        }
        String tempString = "";
        for (int i = 0; i < input.length(); i++){
            tempString = new StringBuilder(input).deleteCharAt(i).toString();
            if (isStringPalindrome(tempString)){
                return true;
            }
        }
        return false;
    }

    public static boolean isStringPalindrome(String input){
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) != input.charAt(input.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeAllowOneMismatch("FodenedOF7"));
        System.out.println(isPalindromeUsingWhileLoop("FodoF"));
    }
}
