package day23_Practice;

import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

      anagram("silent", "listen");



    }

    //17. create a method that can check if two strings are anagram
    public static void anagram (String word1, String word2){

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        Arrays.sort(w1);
        Arrays.sort(w2);
        if (Arrays.equals(w1,w2)){
            System.out.println(word1 + " and " + word2 + " are anagram");
        }else {
            System.out.println(word1 + " and " + word2 + " are not anagram");
        }

    }



}
/*
17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram

 */