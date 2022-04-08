package day17_Practice;

import java.util.Scanner;

public class InsuranceQuote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Enter your gender:");
      String gender = scan.next().toLowerCase();

        while ( !(gender.equals("m") || gender.equals("f")) ){
            System.err.println("Invalid entry, Please re-enter (M/F)");
            gender = scan.next().toLowerCase();
        }
        System.out.println("Are you married? (Yes/No)");
        String a = scan.next().toLowerCase();

        while ( !(a.equals("yes") || a.equals("no"))){
            System.err.println("Invalid entry, Please re-enter (Yes/No)");
            a = scan.next().toLowerCase();
        }

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        while ( !(age>=1 && age<=120)){
            System.err.println("Invalid entry, Please re-enter (1-120)");
            age = scan.nextInt();
        }
        System.out.println("How many miles your drives in a day?");
        int miles = scan.nextInt();

        while ( miles < 5 ){
            System.err.println("Invalid entry, Please re-enter mileage");
            miles = scan.nextInt();
        }
        System.out.println("Want you full coverage or liability insurance?");
        String insurance = scan.next().toLowerCase();

        while ( !(insurance.equals("full") || insurance.equals("liability") )) {
            System.err.println("Invalid entry, Please re-enter (full/liability)");
            insurance = scan.next().toLowerCase();
        }

        System.out.println("Have you accidents or claims in past 5 years (Yes/No)");
        String accident = scan.next().toLowerCase();

        while ( !(accident.equals("yes") || accident.equals("no")) ){
            System.err.println("Invalid entry, Please re-enter (Yes/No)");
            accident = scan.next().toLowerCase();
        }
        System.out.println("Do you have an anti-theft device in your car? (Yes/No)");
        String antiTheft = scan.next().toLowerCase();

        while ( !(antiTheft.equals("yes") || antiTheft.equals("no")) ){
            System.err.println("Invalid entry, Please re-enter (Yes/No)");
            antiTheft = scan.next().toLowerCase();
        }
        double price = 0;


        if (insurance.equals("liability")){
            if (age < 25){
                price +=90;
            }else {
                price += 50;
            }
                if (miles <= 10) {
                    price += 10;
                } else if (miles > 10 && miles <= 50) {
                    price += 30;
                }else if (miles>50){
                    price += 50;
                }

        }else{
            if (age < 25){
                price +=160;
            }else {
                price += 120;
            }
            if (miles <= 10) {
                price += 20;
            } else if (miles > 10 && miles <= 50) {
                price += 40;
            }else if (miles>50){
                price += 70;
            }

        }
        double discountRate = 0;
        if (antiTheft.equals("yes")){
           discountRate +=0.5;
        }
        if (accident.equals("yes")){
            discountRate -= 0.15;
        }else {
            discountRate +=0.1;
        }
        if (a.equals("yes")){
            discountRate +=0.5;
        }

        double total = price * (1 -discountRate);

        System.out.println("Name = " + name);
        System.out.println("Gender = " + gender);
        System.out.println("Age = " + age);
        System.out.println("Married = " + a);
        System.out.println("Has Anti-Theft Devicet = " + antiTheft);
        System.out.println("Had Accident Or Claims = " + accident);
        System.out.println("Insurance Type = " + insurance);
        System.out.println("Your insurance price is = " + total);




        scan.close();







    }
}
/*
  6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount
 */