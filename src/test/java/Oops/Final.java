package Oops;

public final class Final {

    final int size = 10;

    public static void main(String[] args) {

        Final obj = new Final();
        obj.convert();

    }

    final public void convert() {

        System.out.println("This is final method");
    }
}
