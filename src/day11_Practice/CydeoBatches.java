package day11_Practice;

public class CydeoBatches {

    public static void main(String[] args) {

        String type = "EU";
        String result = "";

        if (type == "EU" || type == "US evening" || type == "US morning" ){

            if (type == "EU"){
                result = "Class times are  10-5 EST. M, T, W, Th, F.";
            }else if (type == "US evening"){
                result = "Class times are 7-10 EST. M, T, W, Th, S, S";
            }else {
                result = "Class times are 10-5 EST. M, T, Th, F.";
            }

        }else {
            result = "Invalid Btach";
        }
        System.out.println("Solution 1: " + result);
        System.out.println("-------------------------------------");

        switch (type){

            case "EU":
                result = "Class times are  10-5 EST. M, T, W, Th, F.";
                break;
            case "US evening":
                result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            case "US morning":
                result = "Class times are 10-5 EST. M, T, Th, F.";
                break;
            default:
                result = "Invalid Btach";

        }

        System.out.println("Solution 2: " + result);
        System.out.println("-------------------------------------");

        if (type == "EU" || type == "US evening" || type == "US morning" ){

            switch (type){
                case  "EU":
                    result = "Class times are  10-5 EST. M, T, W, Th, F.";
                    break;
                case "US evening":
                    result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                default:
                    result = "Class times are 10-5 EST. M, T, Th, F.";
            }

        }else {
            result = "Invalid Btach";
        }

        System.out.println("Solution 3: " + result);
    }
}
/*

	4. Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */