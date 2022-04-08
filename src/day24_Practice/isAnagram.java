package day24_Practice;

import java.util.Arrays;

public class isAnagram {

    public static void main(String[] args) {

        String str1 = "cba";
        String str2 = "bac";

        System.out.println(isAnagram(str1,str2));

    }


    public static boolean isAnagram(String word1, String word2) {

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }


}

/*
 2. create a method named isAnagram that passes two String parameters,
  the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true

 */