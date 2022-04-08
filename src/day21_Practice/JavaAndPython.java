package day21_Practice;

import java.util.Arrays;

public class JavaAndPython {

    public static void main(String[] args) {

        String sentence = "java java python python java python";

        String[] word = sentence.split(" ");

      int javaCount = 0;
      int pythonCount = 0;

        for (String s : word) {

            if (s.equalsIgnoreCase("java")){
                javaCount++;
            }else if (s.equalsIgnoreCase("python")){
                pythonCount++;
            }
        }
        System.out.println("Java Count = " + javaCount);
        System.out.println("Python Count = " + pythonCount);




    }
}
/*
6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)





 */