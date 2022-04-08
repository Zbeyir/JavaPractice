package day13_Practice;

import java.util.Scanner;

public class Practice_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentece = scan.nextLine();

        char first = sentece.charAt(0);
        char last = sentece.charAt(sentece.length()-1);

        String initals = first + " " + last;

        System.out.println(initals);

        scan.close();
    }
}
/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence

 */