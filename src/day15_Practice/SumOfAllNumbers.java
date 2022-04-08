package day15_Practice;

public class SumOfAllNumbers {

    public static void main(String[] args) {

        int total = 0;

        for (int i = 1; i <61 ; i++) {

            total +=i;

        }
        System.out.println("total = " + total);
    }
}

/*
3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

 */