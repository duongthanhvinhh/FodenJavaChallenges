package org.foden.chanllenges;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialUsingForLoop(5));
        System.out.println(factorialUsingForLoop(17));
        System.out.println(factorialUsingRecursive(6));
    }
    private static int factorialUsingRecursive(int number){
        if (number < 0) throw new  IllegalArgumentException("Invalid number, number must be positive");
        if (number < 2) return 1;
        return number * factorialUsingRecursive(number - 1);
    }
    private static long factorialUsingForLoop(int number){
        if (number < 0) throw new  IllegalArgumentException("Invalid number, number must be positive");
        if (number < 2) return 1;
        long result = 1;
        for (int i = 2; i <= number; i++){
            result *= i;
        }
        return result;
    }
}
