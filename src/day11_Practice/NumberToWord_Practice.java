package day11_Practice;

public class NumberToWord_Practice {

    public static void main(String[] args) {
        int number = 3;
        String result = "";

        if (number>= 0 && number<=9){

            switch (number){

                case 0:
                    result = "Zero";
                    break;
                case 1:
                    result="One";
                    break;
                case 2:
                    result="Two";
                    break;
                case 3:
                    result="Three";
                    break;
                case 4:
                    result="Four";
                    break;
                case 5:
                    result="Five";
                    break;
                case 6:
                    result="Six";
                    break;
                case 7:
                    result="Seven";
                    break;
                case 8:
                    result="Eight";
                    break;
                default:
                    result="Nine";

            }

        }else {
        result = "Invalid";
        }

        System.out.println("result = " + result);


    }
}
