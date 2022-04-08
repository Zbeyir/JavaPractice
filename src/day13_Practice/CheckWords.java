package day13_Practice;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word one");
        String word1 = scan.next();
        System.out.println("Enter word two");
        String word2 = scan.next();
        System.out.println("Enter word three");
        String word3 = scan.next();
        scan.close();

        int w1 = word1.length();
        int w2 = word2.length();
        int w3 = word3.length();
        String result = "";

        if (w1 == w2 && w2 == w3){
            result = "All words are same length";
        }else if ((w1==w2 && w2!=w3) || (w1!=w2 && w2==w3)|| (w1!=w2 && w1==w3) ){
            result = "Not Same or Different lengths";
        }else {
            result = "All different length";
        }

        System.out.println(result);
    }
}
/*
7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"

 */