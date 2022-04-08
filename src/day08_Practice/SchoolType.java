package day08_Practice;

public class SchoolType {

    public static void main(String[] args) {

        String name = "Meltem";
        byte age = 9;

        boolean elementarySchool = age<6;
        boolean middleSchool = age>=6 && age<=8;
        boolean highSchool = age>=9 && age<=12;
        boolean college = age>=13 && age<=16;
        boolean gradeSchool = age>= 17 && age<=18;

        if (elementarySchool){
            System.out.println(name + " Elementary school");
        }else if (middleSchool){
            System.out.println(name + " Middle school");
        }else if (highSchool){
            System.out.println(name + " High school");
        }else if (college){
            System.out.println(name + " College");
        }else{
            System.out.println(name + " Grad School");
        }

        System.out.println("-----------------------------");

        String school;

        if (age<6){
            school=" Elementary school";
        }else if (age>=6 && age<=8){
            school = " Middle school";
        }else if (age>=9 && age<=12){
            school = " High school";
        }else if (age>=13 && age<=16){
            school = " College";
        }else {
            school = " Grad School";
        }

        System.out.println(name + school);

    }
}

/*
	2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9Scho-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18
 */