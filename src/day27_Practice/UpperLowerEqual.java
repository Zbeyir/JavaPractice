package day27_Practice;

public class UpperLowerEqual {

    public static void main(String[] args) {

        String	str = "JAVA java";
        String lowerCase = "";
        String upperCase = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (Character.isLowerCase(each)){
                lowerCase += each;
            }else if (Character.isUpperCase(each)){
                upperCase += each;
            }



        }

        System.out.println(lowerCase.length() == upperCase.length());




    }
}
/*
4. Write program that returns true if the total number of upper case characters are
 equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true


 */