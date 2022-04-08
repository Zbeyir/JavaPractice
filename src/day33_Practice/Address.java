package day33_Practice;

public class Address {

    public String street, city, state;
    public int zipcode;

    public static String country = "Germany";
    public static String planet = "World";

    public Address(String street, String city, String state, int zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String toString() {
        return zipcode + " " + street+ "\n"+
                state+" " + city + ", "+ zipcode + "\n"+
                country + " " + planet;
    }
}
/*
5. Address Task:
		1. Create a class named Address:

		    Attributes:
		        instance:  street, city, state, zipCode;
		        static: country, planet

	        Add a constructor that can set All the fields (instances)

		    Actions
		            setInfo: sets all the instances
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012

 */