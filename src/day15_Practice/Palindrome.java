package day15_Practice;

public class Palindrome {

    public static void main(String[] args) {

        String str = "nalan";

        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {

            result += str.charAt(i);

        }

        boolean isPalindrome  = str.equals(result);

        System.out.println("isPalindrome = " + isPalindrome);

    }
}
