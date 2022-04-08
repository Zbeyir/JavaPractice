package day13_Practice;

import java.util.Scanner;

public class Practice_4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String fWord = scan.next();

        System.out.println("Enter second word");
        String sWord = scan.next();

        char f = fWord.charAt(0);
        char s = sWord.charAt(0);

        String initials = f + " " + s;

        System.out.println(initials);

        scan.close();


    }
}
/*
4. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output

 */