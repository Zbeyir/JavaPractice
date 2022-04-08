package day20_Practice;

public class Item {

    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        
        int gloves = 0;
        boolean isiPad = false;
        String report ="";
        

        for (int i = 0; i < items.length; i++) {

            String item = items[i];
            double price = prices[i];
            int id = itemIDs[i];
            
            if (item.equals("Gloves")){
                gloves = i;
            }
            
            if (item.equals("iPad")){
                isiPad = true;
            }



           report += item + " - $" + price + " - #" + id + "\n" ;  // benim hatam report diye yeni string acmamam
            // ve acmadigim icin karman corman cikmasi birde en sona "\n" bun isareti koymamam





        }
        System.out.println("first index number of Gloves: " + gloves);
        System.out.println("iPad is contained in the item list: " + isiPad);
        System.out.println(report);



    }
}
/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID



 */
