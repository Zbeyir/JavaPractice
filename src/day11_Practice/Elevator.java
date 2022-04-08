package day11_Practice;

public class Elevator {

    public static void main(String[] args) {

        int num = 3;
        String floor = "";

        if (num>=1 && num<=3){

            if (num == 1){
                floor = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            }else if (num==2){
                floor = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
            }else{
                floor = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }

        }else {
            floor = "Invalid floor - " +num ;

        }

        System.out.println("Solution 1: " + floor);
        System.out.println("------------------------------------------------");

        switch (num){

            case 1:
                floor = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                break;
            case 2:
                floor = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                break;
            case 3:
                floor = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            default:
                floor = "Invalid floor - " +num ;

        }
        System.out.println("Solution 2: " + floor);
        System.out.println("------------------------------------------------");

        if (num>=1 && num<=3){

            switch (num){

                case 1:
                    floor = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                    break;
                case 2:
                    floor = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                    break;
                default:
                    floor = "Floor 3 selected. Companies: Lyft, BofA, Stake house";

            }

        }else {
            floor = "Invalid floor - " +num ;
        }
        System.out.println("Solution 3: " + floor);

    }
}
/*
2. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed


 */