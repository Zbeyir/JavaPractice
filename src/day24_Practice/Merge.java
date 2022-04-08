package day24_Practice;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        System.out.println(Arrays.toString(mergeTwoArray(arr1,arr2)));



    }
public static int[] mergeTwoArray(int[] arr1, int[] arr2){

        int[] merge = new int[arr1.length + arr2.length];

        int i = 0;
    for (int each : arr1) {
        merge[i++] = each;
    }
    for (int each : arr2) {
        merge[i++] = each;
    }
        return merge;
}


}
/*
7. Create a method named merge that passes two integer array parameters,
 the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}

 */