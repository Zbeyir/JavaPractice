package day22_Practice;

import java.util.Arrays;

public class Item {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        System.out.println("-----1.task-------");

        for (String[] item : items) {

            for (String element : item) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("-----2.task-------");

        for (int i = 0; i < items.length; i++) {


            String element2 = "";
            for (int j = items[i].length - 1; j >= 0; j--) {

                element2 = items[i][j];
                System.out.print(element2 + " ");
            }
            System.out.println();
        }

        System.out.println("-----3.task-------");

        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = 0; j < items[i].length; j++) {

                System.out.print(items[i][j] + " "); // bu sekilde hepsinde yazailiriz bence en kisa yol
            }
            System.out.println();
        }
        // 2.loop un icine           ---items[i].length---- yazmadigimizda
        // yani bu sekilde yazarasak ---items.length---- son element cikmiyor !!!!

    }
}
/*
2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado


 */