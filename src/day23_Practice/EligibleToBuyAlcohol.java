package day23_Practice;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        eligibleToBuyAlcohol(26);


    }

//3. create a method that can check if a person is eligible to buy alcohol

    public static void eligibleToBuyAlcohol(int age) {

        if (age>=0 && age<=120) {

            if (age >= 18) {
                System.out.println("You are eligible to buy alcohol!");
            }else {
                System.out.println("You are not eligible to buy alcohol!");
            }
        }else{
            System.out.println("Invalid Age!");
        }

    }

}
