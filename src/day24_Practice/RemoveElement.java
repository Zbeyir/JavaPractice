package day24_Practice;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60};

        int index = 2;

        System.out.println(Arrays.toString(removeElement(array, index)));


    }

    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length-1){
            System.out.println("Invalid Index " + index);
            System.exit(0);
        }


            int[] arr1 = Arrays.copyOfRange(array, 0, index);
        int[] arr2 = Arrays.copyOfRange(array, index + 1, array.length);
        int[] result = new int[arr1.length + arr2.length];

        int i = 0;

        for (int each : arr1) {
            result[i++] = each;
        }
        for (int each : arr2) {
            result[i++] = each;
        }

        return result;
    }


}

/*
10. create a method named removeElement that passes one integer array and one integer,
 the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}
 */