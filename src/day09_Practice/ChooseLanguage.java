package day09_Practice;

public class ChooseLanguage {

    public static void main(String[] args) {

        byte selection = 3;
        String massage;

        if (selection == 1){
            massage = "Hello, thank for you call";
        }else if (selection == 2){
            massage = "Hola, gracias para llamar";
        }else if (selection == 3){
            massage = "Merhabe, aradiginiz icin tesekkürler";
        }else if (selection == 4){
            massage = "Privet, spasibo za vash zvonok";
        }else if (selection == 5){
            massage = "Merci, pour votre appel";
        }else {
            massage = "ivalid selection";
        }
        System.out.println(massage);






    }

}

/*
3. Creata a class called ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

 */