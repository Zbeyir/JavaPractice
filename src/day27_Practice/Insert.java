package day27_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Insert {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        double[] arr2 = {10.6, 20.78, 30.09, 40.09, 50.99};
        char[] arr3 = {'a', 'd', 'l', 'e'};
        String[] arr4 = {"adile", "kemal", "veysel"};

        System.out.println(Arrays.toString(insert(arr, 2, 100)));
        System.out.println(Arrays.toString(insert(arr2, 2, 100.99)));
        System.out.println(Arrays.toString(insert(arr3, 2, 'i')));
        System.out.println(Arrays.toString(insert(arr4, 2, "zehra")));


    }

    public static int[] insert(int[] array, int idex, int element) {

        if (idex < 0 || idex > array.length - 1) {
            System.out.println(idex + " is invalid index");
            System.exit(0);
        }
        int[] result = new int[array.length + 1];
        result[idex] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {

            if (i == idex) {
                j++;
            }
            result[j] = array[i];
        }
        return result;
    }

    public static double[] insert(double[] array, int idex, double element) {

        if (idex < 0 || idex > array.length - 1) {
            System.out.println(idex + " is invalid index");
            System.exit(0);
        }
        double[] result = new double[array.length + 1];
        result[idex] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {

            if (i == idex) {
                j++;
            }
            result[j] = array[i];
        }
        return result;
    }

    public static char[] insert(char[] array, int idex, char element) {

        if (idex < 0 || idex > array.length - 1) {
            System.out.println(idex + " is invalid index");
            System.exit(0);
        }
        char[] result = new char[array.length + 1];
        result[idex] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {

            if (i == idex) {
                j++;
            }
            result[j] = array[i];
        }
        return result;
    }

    public static String[] insert(String[] array, int idex, String element) {

        if (idex < 0 || idex > array.length - 1) {
            System.out.println(idex + " is invalid index");
            System.exit(0);
        }
        String[] result = new String[array.length + 1];
        result[idex] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {

            if (i == idex) {
                j++;
            }
            result[j] = array[i];
        }
        return result;
    }


}
/*
1. Insert Task:
		1.1 Create a method named insert that passes three parameters:
		 integer array, integer index, integer element.
		  the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array

 */