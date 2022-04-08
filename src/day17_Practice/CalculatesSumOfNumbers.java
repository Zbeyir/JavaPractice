package day17_Practice;

import java.util.Scanner;

public class CalculatesSumOfNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       /* System.out.println("Enter first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter second number:");
        int num2 = scan.nextInt();
        System.out.println(num1+num2);

        while (num1 >= 0 && num2 >= 0){
            System.out.println("Enter first number:");
            num1 = scan.nextInt();
            System.out.println("Enter second number:");
            num2 = scan.nextInt();
            System.out.println(num1+num2);
        }*/ // ==> girilen sayilarin toplami dedigi icin benim ki yanlis



        int sum = 0;
        while (true){
            System.out.println("Enter a umber:");
            int num = scan.nextInt();

            if (num < 0 ){
                break;
            }
            sum += num;
        }

        System.out.println(sum);

                scan.close();



    }
}
/*
2. Write a program that calculates the sum of numbers entered
 by the user until user enters a negative number.

            hint: you need an infinite loop

 */