package day33_Practice;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Nalan",9,'F');
        Person person2 = new Person("Meltem",6,'F');

        System.out.println(person1);
        System.out.println(person2);

        person1.eat("Appeal");
        person2.eat("Bread");
        person1.drink("Tee");
        person2.drink("Watter");

    }
}
