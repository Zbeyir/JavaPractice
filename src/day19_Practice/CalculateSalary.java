package day19_Practice;

import java.util.Scanner;

public class CalculateSalary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("How much you make an hour?");
            double salary = scan.nextDouble();

            if ( !(salary>0)){
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }
            System.out.println("How many hours do you work per week?");
            int hours = scan.nextInt();

            if (!(hours>=1 && hours<=144) ){
                System.err.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate");
            double taxRate = scan.nextDouble();

            if ( !(taxRate>=0 && taxRate<=10)){
                System.err.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }
            System.out.println("Gross Salary: $" + salary );
            System.out.println("Federal Tax: $" + (salary*26/100));
            System.out.println("State Tax: $" + (salary*taxRate/100));
            System.out.println("Total Tax: $" + (salary*26/100)+(salary*taxRate/100));
            System.out.println("Net Income: $" + (salary - (salary*26/100)+(salary*taxRate/100) ));

            System.out.println("Would you like to continue? (yes/no)");
            String ant = scan.next().toLowerCase();

            if (!(ant.equals("yes") || ant.equals("no")) ){
                System.err.println("Invalid Entry");
                System.exit(0);

            }

            if (ant.equals("no")){
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }


        }

       scan.close();

    }
}
/*
. Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program after displaying
					 the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate the program
					after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the program after
					 displaying the error message "Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying
				 the error message "Invalid Entry"


 */