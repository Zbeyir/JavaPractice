package day26_Practice;

public class MathUtility {

    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 4;
        double num3 = 8.6;
        double num4 = 4.6;

        System.out.println(sum(num1, num2));
        System.out.println(sum(num3, num4));
        System.out.println(subtraction(num1, num2));
        System.out.println(subtraction(num3, num4));
        System.out.println(multiplication(num1, num2));
        System.out.println(multiplication(num3, num4));
        System.out.println(division(num3, num4));
        evenNumber(num1);
        oddNumber(num2);
        System.out.println(max(num1,num2));
        System.out.println(max(num3,num4));
        System.out.println(min(num1,num2));
        System.out.println(min(num3,num4));
        System.out.println(square(num1));
        System.out.println(square(num3));
        System.out.println(cube(num1));
        System.out.println(cube(num3));


    }

    //2.1 Create a method that can return the sum of two integers
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    //2.2 Create a method that can return the sum of two decimal numbers
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    //2.3 Create a method that can return the subtraction of two integers
    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    //2.4 Create a method that can return the subtraction of two decimals
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    //2.5 Creata a method that can return the multiplication of two integers
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    //2.6 Creata a method that can return the multiplication of two decimals
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    //2.7 Create a method that passes two double parameters and return the division reslt
    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    //2.8 Create a method that can check if an integer is even number
    public static void evenNumber(int num1) {
        if (num1 % 2 == 0) {
            System.out.println(num1 + " is even numbers");
        }else {
            System.out.println(num1 + " is not even numbers");
        }
    }

    //2.9 Create a method that can check if an integer is odd number
    public static void oddNumber(int num1) {
        if (num1 % 2 != 0) {
            System.out.println(num1 + " is odd numbers");
        }else {
            System.out.println(num1 + " is not odd numbers");
        }
    }

    //2.10 Create a method that can return the maximum number between two integers
    public static int max(int num1, int num2) {
        int max = 0;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        return max;
    }

    //2.11 Create a method that can return the maximum number between two decimal numbers
    public static double max(double num1, double num2) {
        double max = 0;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        return max;
    }

    //2.12 Create a method that can return the minimum number between two integers
    public static int min(int num1, int num2) {
        int min = 0;
        if (num1 > num2) {
            min = num2;
        } else {
            min = num1;
        }

        return min;
    }

    //2.13 Create a method that can return the minimum number between two decimal numbers
    public static double min(double num1, double num2) {
        double min = 0;
        if (num1 > num2) {
            min = num2;
        } else {
            min = num1;
        }

        return min;
    }

    //2.14 Create a method that can return the square of an integer
    public static int square(int num) {
        return num * num;
    }

    //2.15 Create a method that can return the square of a double
    public static double square(double num) {
        return num * num;
    }

    //2.16 Create a method that can return the cube of an integer
    public static int cube(int num) {
        return num * num * num;
    }

    //2.15 Create a method that can return the cube of a double
    public static double cube(double num) {
        return num * num * num;
    }


}

/*
1. Create a class called MathUtility under the utility package:

			2.1 Create a method that can return the sum of two integers
			2.2 Create a method that can return the sum of two decimal numbers

			2.3 Create a method that can return the subtraction of two integers
			2.4 Create a method that can return the subtraction of two decimals

			2.5 Creata a method that can return the multiplication of two integers
			2.6 Creata a method that can return the multiplication of two decimals

			2.7 Create a method that passes two double parameters and return the division reslt

			2.8 Create a method that can check if an integer is even number
			2.9 Create a method that can check if an integer is odd number

			2.10 Create a method that can return the maximum number between two integers
			2.11 Create a method that can return the maximum number between two decimal numbers

			2.12 Create a method that can return the minimum number between two integers
			2.13 Create a method that can return the minimum number between two decimal numbers

			2.14 Create a method that can return the square of an integer
					Ex: square(2) ==> 4
			2.15 Create a method that can return the square of a double

			2.16 Create a method that can return the cube of an integer
			2.17 Create a method that can return the cube of a double

 */