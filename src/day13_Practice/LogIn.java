package day13_Practice;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String userName = scan.nextLine();
        System.out.println("Enter your password:");
        String passWord = scan.nextLine();
        scan.close();


             //String userName1 = "Cydeo";
             //String passWord1 = "WoodenSpoon";
        String result = "";

        if (userName.equals("Cydeo") && passWord.equals("WoodenSpoon")){
            result = "Logged in.";
        }else{
            result = "Incorrect username or password";
        }

        System.out.println(result);

    }
}
/*
8. You are writing a code for the log-in function of the Cybertek Application,
assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
        If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method
 */