package day19_Practice;

import java.util.Scanner;

public class GradeCalculate {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Enter your score");
            double score = scan.nextDouble();

            if (score>=90){
                System.out.println("A");
            }else if (score>=80){
                System.out.println("B");
            }else if (score>=70){
                System.out.println("C");
            }else if (score>=60){
                System.out.println("D");
            }else if (score>=0){
                System.out.println("F");
            }
            else {
                System.err.println("Invalid Entry");
                System.exit(0);
            }

            System.out.println("Would you like to continue? (yes/no)");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no") )){
                System.err.println("Invalid Entry, Please re-enter (yes/no)");
                a = scan.next().toLowerCase();
            }
            if (a.equals("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                break;
            }

        }

        scan.close();
    }
}
/*
4. Write a program for grade calculator:
			1. Ask the user "Enter your score"
				If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

			 2. Display the grade of the student.
			 		90 ~ 100 ==> A
			 		80 ~ 89 ==> B
			 		70 ~ 79 ==> C
			 		60 ~ 69 ==> D
			 		0 ~ 59 ==> F

			2. Ask the user would you like to continue
				If "yes" --> repeat the previous steps
				If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


 */