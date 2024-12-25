package org.foden;

public class SwapTwoNumbers {

    public static void swapTwoNumbersUsingThirdVariable(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    public static void swapTwoNumbersWithoutUsingThirdVariable(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        swapTwoNumbersUsingThirdVariable(3, 6);
        swapTwoNumbersWithoutUsingThirdVariable(3, 6);
    }
}
