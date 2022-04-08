package day17_Practice;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int p = 0;

        while (true){
            System.out.println("Wants to reserve a room?");
            String a = scan.next().toLowerCase();

            while ( !(a.equals("yes") || a.equals("no"))){
                System.err.println("Invalid answer, Please re-enter yes/no");
                a = scan.next().toLowerCase();

            }

            if (a.equals("yes")){
                System.out.println("Which room type do you want to book?");
                System.out.println("King Bed ==> 120$");
                System.out.println("Queen Bed ==> 100$");
                System.out.println("Single Bed ==> 80$");
            }
            scan.nextLine();
            String roomType = scan.nextLine().toLowerCase();

            while ( !(roomType.equals("king bed") || roomType.equals("queen bed") || roomType.equals("single bed"))){
                System.err.println("Invalid answer, Please re-enter (King Bed/Queen Bed/single bed)");
                roomType = scan.nextLine().toLowerCase();

            }
            if (roomType.equals("king bed")){
                System.out.println("King Bed ==> 120$");
                break;

            }
            if (roomType.equals("queen bed")){
                System.out.println("Queen Bed ==> 100$");
                break;

            }
            if (roomType.equals("single bed")){
                System.out.println("Single Bed ==> 80$");
                break;
            }

            if (a.equals("no")) {
                System.out.println("Have a nice day");
                break;
            }

        }


        scan.close();
    }
}
/*
5. Create a class called RoomReservation, write a program for the room reservation,
your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve.
    	 if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter
    			 until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect
            the room until user provides a valid entry)


 */