package day17_Practice;

public class Divisible {

    public static void main(String[] args) {

        String div15 = "";
        String div5 = "";
        String div3 = "";

        for (int i = 1; i <101 ; i++) {

            if (i % 15==0){
                div15 += i + " ";
            }
            if (i % 15!=0 && i % 5 ==0){
                div5 += i + " ";
            }
            if (i % 15!=0 && i % 3 ==0){
                div3 += i + " ";
            }

        }
        System.out.println("div15 = " + div15);
        System.out.println("div5 = " + div5);
        System.out.println("div3 = " + div3);
    }
}
