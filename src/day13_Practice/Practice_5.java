package day13_Practice;

import java.util.Scanner;

public class Practice_5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");

        String s1 = scan.nextLine();

        scan.close();


        int w = s1.length();

        char lastTree = s1.charAt(s1.length()-3);
        char lastTwo = s1.charAt(s1.length()-2);
        char lastOne = s1.charAt(s1.length()-1);

        if (w ==0){
            System.out.println(" string is empty");
        }else if (w>3){
            System.out.println("the last three characters: " +lastTree + lastTwo + lastOne);
        }else {
            System.out.println(s1);
        }


    }
}
/*
5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */