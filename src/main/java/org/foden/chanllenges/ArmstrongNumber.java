package org.foden.chanllenges;

public class ArmstrongNumber {

    public static boolean isArmstrongNumber(int number){
        int sum = 0;
        if (number <0) number = Math.abs(number);
        int temp = number;
        while (number > 0){
            sum += (int) Math.pow((number % 10), String.valueOf(temp).length());
            number = number / 10;
        }
        return temp == sum;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(370));
        System.out.println(isArmstrongNumber(2));
    }
}
