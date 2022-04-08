package day23_Practice;

public class Calculator {

    public static void main(String[] args) {
        calculator(2,3,'/');



    }

    //15. create a method named calculator that passes three arguments (num1, num2, mathOperator),
    // prints the calculation result
    public static void calculator(double num1, double num2, char mathOperator ){

        if (mathOperator=='+'){
            System.out.println(num1+num2);
        }else if (mathOperator=='-'){
            System.out.println(num1-num2);
        }else if (mathOperator=='*'){
            System.out.println(num1*num2);
        }else if (mathOperator=='/'){
            System.out.println(num1/num2);
        }


    }


}
