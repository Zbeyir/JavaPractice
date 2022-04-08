package day31_Practice;

public class SalaryCalculator {

    public double  hourlyRate, stateTaxRate, federalTaxRate, weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }


    public double salary(){
     double salaryTotal = hourlyRate * weeklyHours * 52;
     return salaryTotal;
    }

    public double stateTax(){
        double totalStateTax = salary() * stateTaxRate / 100;
        return totalStateTax;
    }

    public double federalTax(){
        double totalFederalTax = salary() * federalTaxRate / 100 ;
        return totalFederalTax;
    }

    public double salaryAfterTax(){
        double salaryAfterTax = salary() - (stateTax() + federalTax());
        return salaryAfterTax;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", salary=" + salary() +
                ", salary after tax=" + salaryAfterTax() +
                '}';
    }
}
/*
1. SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object


 */