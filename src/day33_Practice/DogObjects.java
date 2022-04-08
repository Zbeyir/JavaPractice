package day33_Practice;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Hund", "Buldok","Small","Black",'M',2);

        System.out.println(dog1);
        dog1.eat();
        dog1.play();
        dog1.sleep();


    }
}
