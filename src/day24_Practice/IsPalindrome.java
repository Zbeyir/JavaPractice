package day24_Practice;

public class IsPalindrome {

    public static void main(String[] args) {

        String str = "Level";

        String result = Reverse.reverse(str);

        if (str.equalsIgnoreCase(result)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }



    }



}

/*
4. By using the reverse method above to create another method named isPalindrome
 that passes a String parameter, the method returns true if the string is palindrome,
  otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true

 */