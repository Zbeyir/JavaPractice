package day14_Practice;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class Practice_5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        scan.close();

        int w = word.charAt(0);
        String result = "";

        if (w>=48 && w<=57){
            result = "first character is digit";
        }else if (w>=65 && w<=90){
            result = "first character is uppercase letter";
        }else if (w>=97 && w<=122){

            result = "first character is lowercase letter";
        }else{
            result = "first character is special character";
        }
        System.out.println(result);


    }
}
/*
  5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table

 */