package day14_Practice;

public class EmailTask1 {

    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";



        String m1 = email.substring(email.indexOf("_")+1 , email.indexOf("@") );
        String m2 = email.substring(email.indexOf("@"));
        String m3 = email.substring(0 , email.indexOf("_"));

        System.out.println(m1 + "_" + m3 + m2);






    }
}
/*
7. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */