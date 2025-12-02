package org.foden.chanllenges;

import java.util.*;

public class AllDuplicateElementInArray {

    public static ArrayList<Integer> findAllDuplicateEle(int[] arr){
        ArrayList<Integer> output = new ArrayList<>();
        Set<Integer> noDuplicated = new HashSet<>();
        for (int ele : arr){
            if (!noDuplicated.add(ele)){
                output.add(ele);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(findAllDuplicateEle(new int[]{2,3,4,4,4,1,2,9,0}));
    }
}
