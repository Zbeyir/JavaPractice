package day16_Practice;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

public class HowManyPositiveAndNegativeNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number for 5 times:");

        int positiveCount = 0;
        int negativeCount = 0;


        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt();

            if (num>0){
                positiveCount ++;

            }else if (num<0){

                negativeCount ++;
            }

        }

        System.out.println(positiveCount + " positive anad " + negativeCount + " negative");
scan.close();

    }
}
/*
1. Write a program that asks user to enter number for 5 times,
 and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */