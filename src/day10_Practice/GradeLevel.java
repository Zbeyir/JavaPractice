package day10_Practice;

public class GradeLevel {

    public static void main(String[] args) {

       byte number = 13;
       String school = "";

       if (number>=1 && number<=18){

           if (number>=1 && number<=5){
               school = "Elementary school";
           }else if (number>=6 && number<=8){
               school = "Middle school";
           }else if (number>=9 && number<=12){
               school = "High school";
           }else if (number>=13 && number<=16){
               school = "College";
           }else {
               school = "Grad School";
           }

       }else {
           school = "Invalid grade level given";
       }


        System.out.println("school = " + school);



    }
}
/*
1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */