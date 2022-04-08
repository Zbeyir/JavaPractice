package day27_Practice;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        double[] arr2 = {10.2,20.23,30.45,40.55,50.55};
        char[] arr3 = {'a', 'd','i', 'l', 'e','a'};
        String[] arr4 = {"adile", "kemal", "veysel", "zahra", "ibrahim"};

        System.out.println(Arrays.toString(swap(arr,2,4)));
        System.out.println(Arrays.toString(swap(arr2,2,4)));
        System.out.println(Arrays.toString(swap(arr3,2,4)));
        System.out.println(Arrays.toString(swap(arr4,2,4)));





    }
    public static int[] swap(int[] array, int index1, int index2){

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }

    public static double[] swap(double[] array, int index1, int index2){

        double temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }

    public static char[] swap(char[] array, int index1, int index2){

        char temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }

    public static String[] swap(String[] array, int index1, int index2){

        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }





}
/*
2. Swap Task:
	2.1 Create a method named swap that passes three parameters:
	 integer array, integer i, integer j. the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array

 */