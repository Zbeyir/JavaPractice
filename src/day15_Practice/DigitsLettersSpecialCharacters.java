package day15_Practice;

public class DigitsLettersSpecialCharacters {

    public static void main(String[] args) {

        String str = "mn@#123Ab!";

        String letters = "";
        String digits = "";
        String special = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= '0'  && ch <= '9'){

                digits += ch;

            }else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ){

                letters += ch;
            }else {

                special += ch;
            }

        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("special = " + special);


    }
}
/*
5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */