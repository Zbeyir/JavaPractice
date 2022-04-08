package day09_Practice;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 37;
        String word;

        if (age>=1 && age<=2){
            word = "Infat";
        }else if (age>=3 && age<=5){
            word = "Toddler";
        }else if (age>=6 && age<=9){
            word = " Kid";
        }else if (age>=10 && age<=12){
            word = "Pre-Teen";
        }else if (age>=13 && age<=17){
            word = "Teenager";
        }else if (age>=18 && age<=20){
            word = "Young Adult";
        }else if (age>=21 && age<=39){
            word = "Adult";
        }else if (age>=40 && age<=49){
            word = "Young Middle-Aged Adult";
        }else if (age>=50 && age<=54){
            word = "Middle-Aged Adult";
        }else if (age>=55 && age<=64){
            word = "Very Young Senior Citizen";
        }else if (age>=65 && age<=74){
            word = "Young Senior Citizen";
        }else if (age>=75 && age<=84){
            word = "Senior Citizen";
        }else if (age>=85){
            word = "Old Senior";
        }else {
            word = "invalid age ";
        }
        System.out.println(word);







    }

}


/*
5. Create a class called AgeGroups, and write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
 */