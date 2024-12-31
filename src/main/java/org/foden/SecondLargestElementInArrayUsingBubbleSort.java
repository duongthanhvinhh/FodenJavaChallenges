package org.foden;

public class SecondLargestElementInArrayUsingBubbleSort {

    public static int findSecondLargestEleUsingBubbleSort(int[] numbers){
        if (numbers.length < 2) throw new RuntimeException("Array must have at least two elements to use this method!");
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length - i - 1; j++){
                int temp;
                if (numbers[j] < numbers[j + 1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers[1];
    }

    public static void main(String[] args) {
        System.out.println(findSecondLargestEleUsingBubbleSort(new int[]{3,44,7,586,35,0}));
    }
}
