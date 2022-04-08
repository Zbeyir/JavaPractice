package day09_Practice;

public class CalculateSalaryAfterTax2 {

    public static void main(String[] args) {

        double salary = 133000;
        double afterTax;
        boolean isMarried = true;

        if (salary>=130000 && !isMarried){
            afterTax = salary * 0.65;
        }else if (salary>=100000 && salary<130000 && !isMarried){
            afterTax = salary * 0.70;
        }else if (salary>=80000 && salary<100000 && !isMarried){
            afterTax = salary * 0.75;
        }else if (salary<80000 && !isMarried){
            afterTax = salary * 0.80;
        }else if (salary>=130000 && isMarried){
            afterTax = salary * 0.70;
        }else if (salary>=100000 && salary<130000 && isMarried){
            afterTax = salary * 0.75;
        }else if (salary>=80000 && salary<100000 && isMarried){
            afterTax = salary * 0.80;
        }else {
            afterTax = salary * 0.85;
        }
        System.out.println("Salary after tax: $" + afterTax);






    }
}

/*
2. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax

 */