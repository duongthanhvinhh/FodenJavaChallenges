package org.foden.chanllenges;

import java.util.ArrayList;
import java.util.List;

public class Somethings {

    public static void main(String[] args) {
        System.out.println(generateFibonacci(6));
    }

    public static List<Integer> generateFibonacci(int n){
        int prev = 0;
        int next = 1;
        List<Integer> integerList = new ArrayList<>();

        switch (n){
            case 0:
                    break;
            case 1: integerList.add(prev);
                    break;
            case 2: integerList.add(prev);
                    integerList.add(next);
                    break;
            default:
                    integerList.add(prev);
                    integerList.add(next);
                    for (int i = 3; i <= n; i++){
                        int temp = prev;
                        prev = next;
                        next = next + temp;
                        integerList.add(next);
                    }
        }
        return integerList;
    }
}
