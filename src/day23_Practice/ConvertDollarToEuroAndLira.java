package day23_Practice;

public class ConvertDollarToEuroAndLira {

    public static void main(String[] args) {

        convertToEuro(6000);

        convertToLira(6000);


    }

    //9. create a method that can convert dollar to euro

    public static void convertToEuro(double money){

        double convert = money* 0.91;

        System.out.println(money + "$ ==> " + convert + " Euro");


    }


   // 10. create a method that can can convert dollar to lira
   public static void convertToLira(double money){

        double convert = money*16.64;

       System.out.println(money + "$ ==> " + convert + " Turkish Lira");

   }

}
