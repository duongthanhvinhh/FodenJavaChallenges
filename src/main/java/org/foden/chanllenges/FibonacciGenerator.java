package org.foden.chanllenges;

import java.util.ArrayList;
import java.util.List;

public class FibonacciGenerator {

    public static void main(String[] args) {
        System.out.println(generateFibonacci(17));
        System.out.println(generateFibonacci(2));
    }

    private static List<Integer> generateFibonacci(int n){
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        List<Integer> result = new ArrayList<>();
        if (n == 0) return result;
        if (n == 1) {
            result.add(0);
            return result;
        }
        result.add(0);
        result.add(1);
        for (int i = 2; i < n; i++){
            int next = result.get(i - 1) + result.get(i - 2);
            result.add(next);
        }
        return result;
    }
}
