package day16_Practice;

public class FrequencyOfDogCat {

    public static void main(String[] args) {

        String str = "caT dog dogG cAt";

        int dogAccount = 0;
        int catAccount = 0;

        for (int i = 0; i <= str.length()-3; i++) {

            String s = str.substring(i , i+3);

            if (s.equalsIgnoreCase("dog")){
                dogAccount ++;
            }
            if (s.equalsIgnoreCase("cat")){
                catAccount ++;
            }
        }

        boolean result = catAccount == dogAccount;
        System.out.println(result);

    }
}
/*
5. write a program to print true if the string "cat" and "dog"
appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true

 */