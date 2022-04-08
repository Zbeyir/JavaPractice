package day20_Practice;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

int[] num = new int[nums.length];

        for (int i = nums.length - 1 , j=0; i >= 0; i-- , j++) {

      num[j] =nums[i];



        }
        System.out.println(Arrays.toString(num));


    }
}
/*
	5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

 */