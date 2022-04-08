package day21_Practice;

import java.util.Arrays;

public class SortTheArray {

    public static void main(String[] args) {

        int[] numbers = {44,77,89,90,6,7,76,89,123,1,-1};

        Arrays.sort(numbers);

    int[] des = new int[numbers.length];

        for (int i = numbers.length - 1, j=0; i >= 0; i--, j++) {
            des[j]=numbers[i];
        }
        System.out.println(Arrays.toString(des));
    }
}
/*
1. Write a program that sort the array of integer in descending order
 */