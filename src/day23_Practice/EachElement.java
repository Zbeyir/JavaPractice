package day23_Practice;

public class EachElement {

    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6,7};

        eachElement(numbers);



    }
    public static void eachElement(int[] arr){

        for (int each : arr) {
            System.out.print(each + " ");

        }

    }




}
/*
14. create a method named print EachElement that can print each elements of an integer array
 */