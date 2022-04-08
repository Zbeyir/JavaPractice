package day28_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicate {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 7, 7));
        System.out.println(list);

        int firstDuplicate = 0;

        for (Integer each : list) {

            int frequency = 0;

            for (Integer element : list) {

                if (each == element) {
                    frequency++;
                }

                }
            if (frequency > 1){   // eger bunu ikin ci for un icine yazsa idik o zaman son duplicate rakamini veriyor
                firstDuplicate = each;
                break;
            }
        }
        System.out.println("firstDuplicate = " + firstDuplicate);

    }
}
/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2


 */