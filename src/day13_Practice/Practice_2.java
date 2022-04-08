package day13_Practice;

import java.util.Scanner;

public class Practice_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first string");
        String fString = scan.nextLine();
        System.out.println("Enter second string");
        String sString = scan.nextLine();

        int totalFirst = fString.length();
        int totalSecond = sString.length();

        if (totalFirst > totalSecond){
            System.out.println(fString);
        }else if(totalFirst < totalSecond){
            System.out.println(sString);
        }else {

        }


    scan.close();
    }
}
/*
2. write a program that asks user to enter two strings, and print out the longest string
 */