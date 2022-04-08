package day13_Practice;

import java.util.Scanner;

public class Practice_3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.nextLine();

        char f = word.charAt(0);
        char l = word.charAt(word.length()-1);

        if (f == l ){
            System.out.println("same");
        }else {
            System.out.println("different");
        }

        scan.close();

    }
}
/*
3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */