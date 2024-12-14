package interview_questions;

public class Palindrome {

    public static void main(String[] args) {
        intPalindrome();
    }

    public static void intPalindrome() {
        int value = 232;
        int remainder = 0;
        int sum = 0;
        int temp = value;

        while (value != 0) {
            remainder = value%10;
            value = value/10;
            sum = sum*10+remainder;
        }
        if (sum == temp) {
            System.out.println("Given value is palindrome");
        }
        else {
            System.out.println("Given value is not palindrome");
        }
    }
}
