package Oops;


public class Stack {

    public static void main(String[] args) {
        basics();
    }

    public static void basics() {

        java.util.Stack<String> stack = new java.util.Stack<>();
        stack.push("main method");
        stack.push("basics method");

        String topElementRemoved = stack.pop();
        System.out.println("Top element removed: "+topElementRemoved);

        String topElement = stack.peek();
        System.out.println("Top element is: "+ topElement);

        int size = stack.size();
        System.out.println(size);

        int value = stack.search("main method");   // If it is available, then it prints 1, otherwise it prints -1
        System.out.println(value);

        System.out.println(stack);

    }
}
