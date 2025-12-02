package org.foden.chanllenges;

import java.util.Arrays;

public class ReverseArray {

    public static String[] reverseStringArray(String[] strArr){
        if (strArr.length < 2) return strArr;
        for (int i = 0; i < strArr.length / 2; i++){
            String temp = strArr[i];
            strArr[i] = strArr[strArr.length - i - 1];
            strArr[strArr.length - i - 1] = temp;
        }
        return strArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseStringArray(new String[]{"Foden", "Duong", "Vinh", "Foden"})));
    }
}
