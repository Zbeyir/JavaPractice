package day18_Practice;

import java.util.Scanner;

public class RoomReservation{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int price = 0;

        while (true){
            System.out.println("Which bedroom do you wants to reserve?");
            System.out.println("\t\tKing Bed ==> 120$");
            System.out.println("\t\tQueen Bed ==> 100$");
            System.out.println("\t\tSingle Bed ==> 80$");
            String room = scan.nextLine().toLowerCase();

            while ( !(room.equals("king bed") ||room.equals("queen bed") || room.equals("single bed") )){
                System.err.println("Invalid entry, Please re-enter");
                room = scan.nextLine().toLowerCase();
            }
            price += ( room.equals("king bed") ) ? 120 :  ( room.equals("quen bed") )  ? 100 : 80;

            System.out.println("Would you like to reserve another room?");
            String roomAnother = scan.nextLine().toLowerCase();

            while ( !(roomAnother.equals("yes") || roomAnother.equals("no"))){
                System.err.println("Invalid entry, Please re-enter");
                System.out.println("Would you like to reserve another room?");
                roomAnother = scan.nextLine().toLowerCase();
            }

            if (roomAnother.equals("no")){
                System.out.println("Your total price is : $" + price);
                break;
            }

        }

        scan.close();


    }
}
/*
2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            Single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry


 */