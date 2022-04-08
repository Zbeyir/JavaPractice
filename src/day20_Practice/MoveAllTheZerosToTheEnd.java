package day20_Practice;

import java.util.Arrays;

public class MoveAllTheZerosToTheEnd {

    public static void main(String[] args) {

        int [] array = {10, 0, 5, 0, 1, 0};
        Arrays.sort(array);

        int[] move = new int[array.length];

        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            move[j] = array[i];
        }
        System.out.println(Arrays.toString(move));


    }
}
/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */