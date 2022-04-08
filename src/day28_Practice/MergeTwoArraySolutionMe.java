package day28_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoArraySolutionMe {

    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.addAll(Arrays.asList("A","B","C"));

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.addAll(Arrays.asList("D","E","F","G"));

        System.out.println(arr1);
        System.out.println(arr2);

        ArrayList<String> list = new ArrayList<>();

        list.addAll(arr1);
        list.addAll(arr2);
        System.out.println(list);








    }
}
/*
4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */