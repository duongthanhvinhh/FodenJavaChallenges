package org.foden;

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

    public static boolean isPalindromeUsingForLoop(String str){
        if (str.length() < 2) return false;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != str.charAt(str.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeUsingForLoop("Foden"));
        System.out.println(isPalindromeUsingWhileLoop("FodoF"));
    }
}
