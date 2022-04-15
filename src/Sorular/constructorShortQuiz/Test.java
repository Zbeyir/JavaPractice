package Sorular.constructorShortQuiz;

public class Test {

    public Test(){
        System.out.println("A");
    }
    public Test(int a){
        this(2.5);
        System.out.println("B");
    }
    public Test(double c){
        this();
        System.out.println("C");
    }

    public static void main(String[] args) {
        Test obj = new Test(100);
    }

}


/*
1--Every class MUST have constructor, if no constructor is given,
 compiler will throw an exception during the runtime ---(true)

2--Constructor' execution always depends on the creation of the object --(true)

3--A constructor method can have a return-type in the method signature --(false)

4--Constructor methods can be overload --(true)


 */