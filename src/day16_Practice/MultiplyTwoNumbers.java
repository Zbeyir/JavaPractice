package day16_Practice;

import java.util.Scanner;

public class MultiplyTwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        scan.close();

        int result = 0;

        for (int i = 0; i < n1; i++) {


                result += n2;


        }
        System.out.println(result);

    }
}
/*
3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200

 */