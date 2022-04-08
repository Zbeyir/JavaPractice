package day17_Practice;

import java.util.Scanner;

public class CalculatesTwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Enter two number:");
            double num1 = scan.nextDouble();
            double num2 = scan.nextDouble();
            System.out.println("Enter a operator: (+, -, *, /)");
            char a = scan.next().charAt(0);

            while ( !(a =='+' || a =='-' || a == '*'|| a == '/')){
                System.err.println("Invalid operator, Please re-enter");
                a = scan.next().charAt(0);
            }
            if (a =='+' ){
                System.out.println(num1+num2);
            }else if (a =='-' ){
                System.out.println(num1-num2);
            }else if ( a == '*'){
                System.out.println(num1*num2);
            }else if (a == '/'){
                System.out.println(num1/num2);
            }
        }



    }
}
/*
 3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter
		the operator until user provides a valid operator (+, -, *, /)


 */