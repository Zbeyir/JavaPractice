package day11_Practice;

public class Browser_Practice {

    public static void main(String[] args) {

        String browserName = "chrome";
        String result = "";

            switch (browserName){

                case "chrome":
                    result = "Selected chrome browser";
                    break;
                case "firefox":
                    result = "Selected firefox browser";
                    break;
                case "opera":
                    result = "Selected firefox browser";
                    break;
                case "safari":
                    result = "Selected safari browser";
                    break;
                case "edge":
                    result = "Selected edge browser";
                    break;
                default:
                    result = "Invalid Browser";
            }
        System.out.println(result);


    }
}
/*
3.  write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary

 */