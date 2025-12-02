package org.foden.chanllenges;

public class SumOfDigitsOfNumber {

    public static int sumOfDigits(int number){
        int sum = 0;
        if (number < 0) number = Math.abs(number);
        while (number > 0){
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(15904));
    }
}
