package day21_Practice;

public class CountPalindrome {

    public static void main(String[] args) {

        String[] str = {"anna", "level", "Java"};

        int count = 0;
        for (String s : str) {
            String reversed = "";

            for (int i = s.length() - 1; i >= 0; i--) {

                reversed += s.charAt(i);


            }
            if (reversed.equalsIgnoreCase(s)) {
                count++;
            }
        }
        System.out.println("count = " + count);

    }
}
/*
4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2

 */