package day21_Practice;

import java.util.Arrays;

public class EvenAndOdd {

    public static void main(String[] args) {

       int[] numbers = {1,2,3,4,5,6,7,8,9};

       int odd = 0;
       int even = 0;

        for (int number : numbers) {
            if (number%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);






    }
}
/*
2. Write a program that can count the even and odd number from an array of integers

 */