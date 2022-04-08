package day25_Practice;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        double[] arr3 = {1.2, 2.3, 3.4, 5.6};
        char[] arr5 = {'A', 'B', 'F', 'H'};
        String[] arr7 = {"Nalan", "Meltem", "Gülsün"};

        System.out.println(Arrays.toString(reverse(arr1)));
        System.out.println(Arrays.toString(reverse(arr3)));
        System.out.println(Arrays.toString(reverse(arr5)));
        System.out.println(Arrays.toString(reverse(arr7)));


    }

    //1. Create a method that can reverse an integer array
    public static int[] reverse(int[] array) {

        int[] result = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    //2. Create a method that can reverse a double array
    public static double[] reverse(double[] array) {

        double[] result = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    //3. Create a method that can reverse a char array
    public static char[] reverse(char[] array) {

        char[] result = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }


    //4. Create a method that can reverse a String array
    public static String[] reverse(String[] array) {

        String[] result = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }


}

/*
Task 4:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array
 */