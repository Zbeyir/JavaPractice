package Sorular;

public class deneme1 {


    public static void main(String[] args) {

        System.out.println("Hello Cydeo");
        System.out.println("Wooden Spoon");

        int num =5;
        while( isAvailable(num) ) {
            System.out.print(num);
            num--;
        }




    }
    public static boolean isAvailable(int num) {
        return (num--  >  0) ? true : false ;
    }


}
