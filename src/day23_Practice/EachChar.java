package day23_Practice;

public class EachChar {

    public static void main(String[] args) {

        eachChar("meltem nalan");






    }

    //13. create a method named print EachChar that can print each characters of a string
    public static void eachChar(String str){
        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i));
        }




    }



}
