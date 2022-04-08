package Sorular;

public class StringQuiz {

    public static void main(String[] args) {


        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1==s2 is:" + s1==s2);  // sadece sonucu false cikiyor

        System.out.println("s1==s2 is:" + (s1==s2) ); // s1==s2 is:true

        // bu sekilde parantez icinde yazmak lazim yoksa concatenation problemi oluyor

    }
}
