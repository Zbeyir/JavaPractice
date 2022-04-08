package day20_Practice;

public class ClassmatesReverse {

    public static void main(String[] args) {

        String[] classmates = {"Nalan", "Meltem", "Gülsün", "Zübeyir", "Necati", "Sakir", "Remzi", "Canan", "Kadriye",
                "Tanju"};


        for (int i = 0; i < classmates.length; i++) {

            String name = classmates[i];
            String reverseName = "";



            for (int j = name.length()-1; j >=0 ; j--) {

                reverseName += name.charAt(j);
            }

            System.out.println(reverseName);
        }






    }
}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */