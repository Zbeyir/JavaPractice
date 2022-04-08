package day14_Practice;

import java.util.Scanner;

public class Practice_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        scan.close();

        word = word.substring(word.length()-2);

        String result = "";

        if (word.equals("ly")){
            result = "really???";
        }else {
            result = "never mind";
        }
        System.out.println(result);

    }
}
/*
  2. ask the user to enter a word. if the word ends with "ly", print "really???"
  ,  otherwise, print "never mind"

 */