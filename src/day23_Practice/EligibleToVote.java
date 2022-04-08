package day23_Practice;

public class EligibleToVote {

    public static void main(String[] args) {

        eligibleToVote(19,"usa");


    }

    //4. create a method that can check if a person is eligible to vote
    public static void eligibleToVote(int age, String citizen) {


        if (age >= 0 && age <= 120) {
            if (age >= 18 && citizen.equalsIgnoreCase("USA")) {
                System.out.println("You are eligible to vote!");
            } else {
                System.out.println("You are not eligible to vote!");
            }

        } else {
            System.out.println("Invalid!");
        }

    }


}
/*
4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!
 */