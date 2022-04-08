package day33_Practice;

public class IPhone {

    public String model;
    public double price;
    public String color;
    public String size;

    public static String brand = "appeal";
    public static String os = "iOS";
    public static String madeIn = "China";


    public IPhone(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public void faceTime(long phoneNumber){
        System.out.println(model+ " making a call on facetime" + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(model + " making a call on facetime" + email);
    }

    public void call(long phoneNumber){
        System.out.println(model + " calling" + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model + " writing text"  + phoneNumber);
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", OS='" + os + '\'' +
                ", brand='" + brand + '\'' +
                ", made in='" + madeIn + '\'' +
                '}';
    }
}

/*
4. IPhone Task:
		1. Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */