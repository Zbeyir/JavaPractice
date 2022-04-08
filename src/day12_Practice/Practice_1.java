package day12_Practice;

import java.util.Scanner;

public class Practice_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your how many people live with:");

        int n1 = input.nextInt();
        String result = "";

        if (n1 < 3){
        result = "Live with less than 3 people";
        }else if (n1>=3 && n1<=6){
            result = "Live with 3 - 6 people";
        }else
            result = "Live with more than 6 people";

        System.out.println(result);

        input.close();
    }


}
/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"


 */