package day14_Practice;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        scan.close();

        String firstName = email.substring(0 , email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1 , email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1 , email.indexOf("."));

        System.out.println("FirstName = " + firstName);
        System.out.println("LastName = " + lastName);
        System.out.println("Domain = " + domain);



    }
}
/*
8. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple

 */