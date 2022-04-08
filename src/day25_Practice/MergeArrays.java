package day25_Practice;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        double[] arr3 = {1.2,2.3,3.4,5.6};
        double[] arr4 = {6.7,7.8,9.8,10.2};
        char[] arr5 = {'A','B','F','H'};
        char[] arr6 = {'D','H','K'};
        String[] arr7 = {"Nalan","Meltem","Gülsün"};
        String[] arr8 = {"Zübeyir","Milena","Anika"};

        System.out.println(Arrays.toString( merge(arr1, arr2)));
        System.out.println(Arrays.toString(merge(arr3,arr4)));
        System.out.println(Arrays.toString(merge(arr5,arr6)));
        System.out.println(Arrays.toString(merge(arr7,arr8)));


    }
	//1. create a method that can merge two integer arrays.
    public static int[] merge(int[] array1, int[] array2 ){
        int[] result = new int[array1.length+ array2.length];

        int i = 0;
        for (int each : array1) {

            result[i++] = each;
        }
        for (int each : array2) {

            result[i++] = each;
        }
        return result;
    }

    //2. create a method that can merge two double arrays.
    public static double[] merge(double[] array1, double[] array2 ){
        double[] result = new double[array1.length+ array2.length];

        int i = 0;
        for (double each : array1) {

            result[i++] = each;
        }
        for (double each : array2) {

            result[i++] = each;
        }
        return result;
    }


    //3. create a method that can merge two char arrays.
    public static char[] merge(char[] array1, char[] array2 ){
        char[] result = new char[array1.length+ array2.length];

        int i = 0;
        for (char each : array1) {

            result[i++] = each;
        }
        for (char each : array2) {

            result[i++] = each;
        }
        return result;
    }

    //4. create a method that can merge two String arrays.
    public static String[] merge(String[] array1, String[] array2 ){
        String[] result = new String[array1.length+ array2.length];

        int i = 0;
        for (String each : array1) {

            result[i++] = each;
        }
        for (String each : array2) {

            result[i++] = each;
        }
        return result;
    }



}


/*
Task1:
	1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.
 */