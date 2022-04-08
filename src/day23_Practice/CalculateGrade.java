package day23_Practice;

public class CalculateGrade {

    public static void main(String[] args) {

        gradeCalculate(98);



    }

    //5. create a method that can calculate the grade of the student based on the score
    public static void gradeCalculate(int score){

        String result = "";


        if (score>=0 && score<=100){
            result = (score>=90)? "A" :(score>=80)? "B" :(score>=70)? "C" :(score>=60)? "D" :"F";
        }else {
            System.out.println("Invalid Score");
        }
        System.out.println( "Your result: " + result);
    }
}
