package day23_Practice;

public class CalculateAreaCircleSquare {

    public static void main(String[] args) {

        calculateAreaCircle(4);
        calculateAreaSquare(4);


    }

    //6. create a method that can calculate the area of a circle
    public static void calculateAreaCircle(int r){

        int area = r*r;

        System.out.println("Area of the circle is: " + area);


    }

    //7. create a method that can calculate the area of a square
    public static void calculateAreaSquare(int a){

        int area = a*a;

        System.out.println("Area of the square is: " + area);
    }


}
