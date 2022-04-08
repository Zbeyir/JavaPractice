package day11_Practice;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        String size= "Venti";
        String result = "";

        if (size == "Tall" ){
            result = "price is $3.69\n" +
                     "90 calories";
        }else if (size == "Grande" ){
            result = "price is $3.99\n" +
                     "120 calories";
        }else if (size == "Venti"){
            result = "price is $4.29\n" +
                     "150 calories";
        }else {
            result = "Invalid Size";
        }

        System.out.println("Solution 1:\n" + result);
        System.out.println("-----------------------------------------------");

        switch (size){

            case "Tall":
                result = "price is $3.69\n" +
                        "90 calories";
                break;
            case "Grande":
                result = "price is $3.99\n" +
                        "120 calories";
                break;
            case "Venti":
                result = "price is $4.29\n" +
                        "150 calories";
                break;
            default:
                result = "Invalid Size";

        }
        System.out.println("Solution 2:\n" + result);

        System.out.println("--------------------------------------------------------");

        if (size =="Tall" || size == "Grande" || size == "Venti"){

            switch (size){

                case "Tall":
                    result = "price is $3.69\n" +
                            "90 calories";
                    break;
                case "Grande":
                    result = "price is $3.99\n" +
                            "120 calories";
                    break;
                default:
                    result = "price is $4.29\n" +
                            "150 calories";

            }

        }else {
            result = "Invalid Size";
        }

        System.out.println("Solution 3:\n" + result);

    }
}
/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */