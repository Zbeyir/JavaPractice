package day22_Practice;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6}};

        array = reverse2DArray(array);

        System.out.println(Arrays.deepToString(array));


    }

    public static int[][] reverse2DArray(int[][] arr) {

        int[][] reverse = new int[2][3]; // ???birde buranin icinin degerini bilmiyprsak ne yapacaz????
        int row = 0;
        int column = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            column = 0;  //!!!!buraya bunu yazmadigim icin sounuc alamadim!!!!!
            for (int j = arr[i].length - 1; j >= 0; j--) {

                reverse[row][column] = arr[i][j];
                column++;
            }
            row++;
        }
        return reverse;
    }


}
/*
1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};

 */