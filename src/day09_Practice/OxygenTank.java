package day09_Practice;

public class OxygenTank {

    public static void main(String[] args) {

        int level = 60;
        String word;

        if (level>90){
            word ="Your tank is full";
        }else if (level>80){
            word = "Still okay";
        }else if (level>70){
            word = "Don't go too far";
        }else if (level>60){
            word = "Start to head back";
        }else if (level>50){
            word = "Be careful now you at at 50%";
        }else{
            word = "Nanay :))";
        }
        System.out.println(word);






    }
}

/*
4. Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY


 */