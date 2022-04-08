package day14_Practice;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

public class Practice_4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word1 = scan.next();
        String word2 = scan.next();
        scan.close();

        if (word1.equals(word2)){
            System.out.println(word1);
        }else{
            System.out.println(word1+word2);
        }


    }
}
/*
  4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight

 */