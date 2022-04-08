package day20_Practice;

public class ClassmatesInitials {

    public static void main(String[] args) {

        String[] classmates = {"Nalan", "Meltem", "Gülsün", "Zübeyir", "Necati", "Sakir", "Remzi", "Canan", "Kadriye",
        "Tanju"};

        for (String each : classmates) {

            String initials = each.charAt(0)+""; // benim problemim nuraya "" bu isareti koymamak

            System.out.println("initials = " + initials);
        }

        String[] classmates2 = {"Nalan Tabanoglu", "Meltem Tabanoglu", "Gülsün Tabanoglu", "Zübeyir Tabanoglu", 
                "Necati Fil", "Sakir Aslan", "Remzi Aslan", "Canan Kedi", "Kadriye Aslan", "Tanju Uyuz"};

        for (String each2 : classmates2) {
            
            String initials2 = each2.charAt(0) + "." + each2.charAt(each2.indexOf(" ")+1);

            System.out.println("initials2 = " + initials2);
        }






    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */