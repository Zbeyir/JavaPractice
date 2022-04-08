package day19_Practice;

import java.util.Scanner;

public class RectangleCalculate {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Enter the length of the Rectangle:");
            int a = scan.nextInt();

            if ( !(a>0)){
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }
            System.out.println("Enter the width of the Rectangle:");
            int b = scan.nextInt();

            if ( !(b>0)){
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }
            System.out.println("Area of rectangle: " + (2*a+2*b));
            System.out.println("Perimeter of rectangle: " + (a*b) );

            System.out.println("Would you like to calculate another Rectangle? (yes/no)");
            String ant = scan.next().toLowerCase();

            while ( !(ant.equals("yes") || ant.equals("no"))){
                System.err.println("Invalid entry, Please re-enter (yes/no)");
                ant = scan.next().toLowerCase();

            }
            if (ant.equals("no")){
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                break;
            }


        }

scan.close();


    }
}
/*
3. Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying
				 the error message "Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying
				 the error message "Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry


 */