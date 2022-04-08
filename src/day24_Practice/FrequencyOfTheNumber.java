package day24_Practice;

import java.util.Arrays;

public class FrequencyOfTheNumber {

    public static void main(String[] args) {

        int[] array ={1,1,1,1,1,2,2};
        int number = 1;

        System.out.println(frequencyOfTheNumber(array,number));


    }

    public static int frequencyOfTheNumber(int[] array1, int num) {

        int frequencyOfTheNumber = 0;

        for (int each : array1) {

            if (each == num) {
                frequencyOfTheNumber++;

            }

        }
        return frequencyOfTheNumber;
    }


}
/*
5. create method that accepts one integer array and one integer number
and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5


 */