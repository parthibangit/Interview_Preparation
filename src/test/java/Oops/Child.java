package Oops;

public class Child extends Parent {

    String name = "Parthiban";
    String country = "Vietnam";


    public void test1() {
        System.out.println("This is child test1");
        System.out.println("First name is: "+ name);
        System.out.println("Country name is: "+ this.country);

        test3();
    }

}
