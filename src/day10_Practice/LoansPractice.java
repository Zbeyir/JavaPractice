package day10_Practice;

public class LoansPractice {

    public static void main(String[] args) {

        int salary = 500000;
        int score = 750;

        String result = (salary>60000 & score> 650)?  "Loan Approved"       :   "Loan Denied";

        System.out.println("result = " + result);



    }
}
/*
6. Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.

 */