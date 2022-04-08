package day23_Practice;

public class ConvertKg_To_Lb {

    public static void main(String[] args) {

        convertkg_to_lb(1);



    }

    //11. create a method that can convert kg to lb
    public static void convertkg_to_lb(double kg){

        double convert = kg*2.20462;

        System.out.println(kg + " kg = " + convert + " pound");

    }

}
