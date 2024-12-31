package org.foden;

public class PrimeNumber {

    public static boolean isPrimeNumber(int number){
        if (number <= 1) return false;
        for (int i = 2; i < Math.sqrt(number); i++){
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(24));
        System.out.println(isPrimeNumber(2));
    }
}
