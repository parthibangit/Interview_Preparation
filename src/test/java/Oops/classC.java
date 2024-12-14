package Oops;

public class classC {

    public static void main(String[] args) {
//        Child obj = new Child();
//        obj.test1();

        Parent obj = new Child();                 // Upcasting
        obj.test1();
        obj.test2();

    }
}
