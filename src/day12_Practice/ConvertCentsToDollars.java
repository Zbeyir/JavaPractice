package day12_Practice;

import java.util.Scanner;

public class ConvertCentsToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents");

        int cents = input.nextInt();

      int dol = cents/100;
      int cent = cents % 100;

        System.out.println(dol + " dollars and " + cent + " cents");

        input.close();
    }
}
/*
3. Write a program that can convert cents to dollars,
if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents


 */