package day33_Practice;

public class IphoneObjects {

    public static void main(String[] args) {

        IPhone iPhone1 = new IPhone("A123", 1000, "Gold", "Big");

        System.out.println(iPhone1);

        iPhone1.call(123456);
        iPhone1.faceTime("jfkljlfsd");
        iPhone1.faceTime(123455);
        iPhone1.text(2345);
    }
}
