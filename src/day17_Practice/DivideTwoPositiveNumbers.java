package day17_Practice;

public class DivideTwoPositiveNumbers {

    public static void main(String[] args) {

        int a = 50;
        int b = 7;
        int result = 0;


        while (a>=b){
            a -= b;
            result ++;
        }
        System.out.println(result + " with a remainder of " + a);

    }
}
/*
1. Write a program that can divide two positive numbers
 without using / (division) and * (multiplication) operators.
 */