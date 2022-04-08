package day23_Practice;

public class OddOrEven {

    public static void main(String[] args) {

        System.out.println("Even Numbers:");
        evenNumbers(1,100);
        System.out.println();
        System.out.println("Odd Numbers:");
        oddNumbers(1, 100);




    }
//1. create a method that can print odd numbers between 1~100 in a same line saperated by space
    public static void evenNumbers(int a , int b){

        for (int i = a; i <b+1 ; i++) {

            if (i % 2 == 0) {

                System.out.print(i + " ");

            }
        }

    }

//2. create a method that can print even numbers between 1~100 in a same line saperated by space
    public static void oddNumbers(int a, int b){

        for (int i = a; i <b+1 ; i++) {

            if (i % 2 != 0 ){
                System.out.print(i + " ");
            }
        }
    }

}
