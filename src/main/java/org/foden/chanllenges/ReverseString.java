package org.foden.chanllenges;

public class ReverseString {

    public static String reverseString(String str){
        String output = "";
        for (int i = 0; i < str.length(); i++){
            output = output + str.charAt(str.length() - i - 1);
        }
        return output;
    }

    public static String reverseStringUsingStringBuilder(String str){
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(str);
        return strBuilder.reverse().toString();
    }

    public static String reverseStringSecondWay(String str){
        String output = "";
        for (int i = str.length() - 1; i >= 0; i--){
            output += str.charAt(i);
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Foden Duong"));
        System.out.println(reverseStringUsingStringBuilder("Foden Duong"));
        System.out.println(reverseStringSecondWay("Foden Duong"));
    }
}
