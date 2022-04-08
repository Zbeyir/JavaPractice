package day23_Practice;

public class PositiveNegativeZero {

    public static void main(String[] args) {

        positiveNegativeZero(-1);


    }

    //12. create a method that can if the given integer is positive, negative or zero
    public static void positiveNegativeZero(int num) {

        String result = (num > 0) ? "Positive Number" : (num < 0) ? "Negative Number" : "Zero";
        System.out.println(result);
    }
}


