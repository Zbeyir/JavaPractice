package day11_Practice;

public class NameOfMont_Practice {

    public static void main(String[] args) {

        int number = 9;
        String result = "";

        if (number>=1 && number<=12){

            switch (number){
                case 1:
                    result = "January";
                    break;
                case 2:
                    result = "February";
                    break;
                case 3:
                    result = "March";
                    break;
                case 4:
                    result = "April";
                    break;
                case 5:
                    result = "May";
                    break;
                case 6:
                    result = "June";
                    break;
                case 7:
                    result = "July";
                    break;
                case 8:
                    result = "August";
                case 9:
                    result = "September";
                case 10:
                    result = "October";
                case 11:
                    result= "November";
                default:
                    result = "December";


            }

        }else {
            result = "Invalid";
        }

        System.out.println("result = " + result);

    }
}
/*





                result = "November";
            }else {
                result = "December";
            }
 */