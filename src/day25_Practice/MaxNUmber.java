package day25_Practice;

import java.util.Arrays;

public class MaxNUmber {

    public static void main(String[] args) {

        int[] numbers = {9, 8, 7, 1, 3, 4, 55, 10, -1};
        double[] numbers2 = {9.5, 8, 7.5, 1, 3, 4, 5.5, 10.99, -1};
        long[] numbers3 = {9, 8, 7, 1, 3, 4, 55, 10, -1};
        short[] numbers4 = {9, 8, 7, 1, 3, 4, 55, 10, -1};
        float[] numbers5 = {9, 8, 7, 1, 3, 4, 55, 120, -1};
        byte[] numbers6 = {9, 8, 7, 1, 3, 4, 55, 110, -1};


        System.out.println(maxNumber(numbers));
        System.out.println(maxNumber(numbers2));
        System.out.println(maxNumber(numbers3));
        System.out.println(maxNumber(numbers4));
        System.out.println(maxNumber(numbers5));
        System.out.println(maxNumber(numbers6));


    }

    //1. create a method that can return the max number from an integer array
    public static int maxNumber(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    //2. create a method that can return the max number from double array
    public static double maxNumber(double[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    //3. create a method that can return the max number from long array
    public static long maxNumber(long[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    //4. create a method that can return the max number from short array
    public static short maxNumber(short[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    //5. create a method that can return the max number from float array
    public static float maxNumber(float[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    //6. create a method that can return the max number from byte array
    public static byte maxNumber(byte[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }


}
/*
Task 2:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array
 */