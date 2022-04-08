package day14_Practice;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

public class WithoutFirstCharacter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words");
        String word1 = scan.next();
        String word2 = scan.next();
        scan.close();

        word1 = word1.substring(1);
        word2 = word2.substring(1);
        System.out.println(word1 + word2);



    }
}
/*
1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

 */