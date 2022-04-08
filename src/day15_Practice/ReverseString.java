package day15_Practice;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        for (int i = str.length()-1; i >=0  ; i--) {

            char ch = str.charAt(i);

            System.out.print(ch);


        }


    }
}
/*

	7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

 */