package day09_Practice;

public class CharacterIdentity {

    public static void main(String[] args) {

        char characters = '#';

        if (characters >=48 && characters<=57){
            System.out.println("Numbers");
        } else if ((characters>= 65 && characters<=90) || (characters>=97 && characters<=122) ){
            System.out.println("Alphabetic Character");
        }else {
            System.out.println("Special Characcter");
        }








    }

}

/*
4. Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table

 */