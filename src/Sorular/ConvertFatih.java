package Sorular;

public class ConvertFatih {

    public static void main(String[] args) {

        int second = 36798765;

        convert(second);



    }
    public static void convert(int second){
        int secondConvert = second % 60;
        int minute = (second/60) %60;
        int hour = (second /60/60) % 24  ;
        int day = (second/60/60/24)%365 ;
        int year =second /60/60/24/365;

        if (second<0){
            System.out.println("Invalid");
        }else if (second ==0){
            System.out.println("now");
        }else {
            System.out.println(year+" year " +day+" day " +hour+" hour "+minute+" minute "+second + " second");
        }
       

    }
}
/*
I would like to see your solutions on our meetings(This Friday).
Notice: If you didn't watch Method recording, just try to solve without using Method. Just put only comma between of them. You don't need to put 's' end of the word which needs to be plural.
Write a function (method) which formats a duration, given as a number of seconds, in a human-friendly way.
The function must accept a non-negative integer. If it is zero, it just returns "now". Otherwise, the duration is expressed as a combination of years, days, hours, minutes and seconds.
It is much easier to understand with an example:
* For seconds = 62, your function should return
    "1 minute, 2 second"
* For seconds = 3662, your function should return
    "1 hour, 1 minute, 2 second"
For the purpose of this question, a year is 365 days and a day is 24 hours.
Notice Again: If you didn't watch Method recording, just try to solve without using Method
 */