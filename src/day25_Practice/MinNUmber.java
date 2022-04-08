package day25_Practice;

import java.util.Arrays;

public class MinNUmber {

    public static void main(String[] args) {

        int[] numbers = {9, 8, 7, 1, 3, 4, 55, 10, -1};
        double[] numbers2 = {9.5, 8, 7.5, 1, 3, 4, -5.5, 10.99, -1};
        long[] numbers3 = {9, 8, 7, 1, 3, 4, 55, 10, -1};
        short[] numbers4 = {9, 8, -7, 1, 3, 4, 55, 10, -1};
        float[] numbers5 = {9, 8, 7, 1, 3, 4, 55, 120, -1};
        byte[] numbers6 = {-9, 8, 7, 1, 3, 4, 55, 110, -1};

        System.out.println(minNumber(numbers));
        System.out.println(minNumber(numbers2));
        System.out.println(minNumber(numbers3));
        System.out.println(minNumber(numbers4));
        System.out.println(minNumber(numbers5));
        System.out.println(minNumber(numbers6));


    }

    //1. create a method that can return the min number from an integer array
    public static int minNumber(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    //2. create a method that can return the min number from double array
    public static double minNumber(double[] array) {
        Arrays.sort(array);
        return array[0];
    }

    //3. create a method that can return the min number from long array
    public static long minNumber(long[] array) {
        Arrays.sort(array);
        return array[0];
    }

    //4. create a method that can return the mi number from short array
    public static short minNumber(short[] array) {
        Arrays.sort(array);
        return array[0];
    }

    //5. create a method that can return the min number from float array
    public static float minNumber(float[] array) {
        Arrays.sort(array);
        return array[0];
    }

    //6. create a method that can return the min number from byte array
    public static byte minNumber(byte[] array) {
        Arrays.sort(array);
        return array[0];
    }


}
/*
Task 3:
	1. create a method that can return the min number from an integer array

	2. create a method that can return the min number from double array

	3. create a method that can return the min number from long array

	4. create a method that can return the min number from short array

	5. create a method that can return the min number from float array

	6. create a method that can return the min number from byte array


 */
