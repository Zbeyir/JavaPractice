package day19_Practice;

import java.util.Scanner;

public class CircleCalculate {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Enter the radius of the circle:");
            double r = scan.nextDouble();

            if ( !(r > 0) ) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);

            }else {
                System.out.println("Diameter of circle: " + r);
                System.out.println("Area of circle: " + (2*r));
                System.out.println("Perimeter of circle: " + (r*r));
            }

            System.out.println("Would you like to calculate another circle? (Yes/No)");
            String a = scan.next().toLowerCase();

            while ( !(a.equals("yes") || a.equals("no"))){
                System.err.println("invalid entry, Please re-enter");
                a = scan.next().toLowerCase();  // hatam bunu buray a yazmamak

            }

            if (a.equals("no")){
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;

            }


        }

        scan.close();







    }
}
/*
1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying
				 the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry


 */