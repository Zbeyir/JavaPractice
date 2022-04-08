package day09_Practice;

public class EqualNumbers {

    public static void main(String[] args) {

        int n1=100, n2=20, n3=20;
        String word;

        if (n1==n2){
            word="n1&n2 are equal";
        }else if (n2==n3){
            word="n2&n3 are equal";
        }else if (n3==n1){
            word="n3&n1 are equal";
        }else {
            word="none of them are equal";
        }

        System.out.println(word);






    }
}

/*
6. Create a class called EqualNumbers, and write a program that can check the equality of the three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equa
 */