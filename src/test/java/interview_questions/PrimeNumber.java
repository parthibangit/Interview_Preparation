package interview_questions;

public class PrimeNumber {

    public static void main(String[] args) {
       checkPrime();
    }

    public static void checkPrime() {

        int number = 23;
        boolean isPrime = true;
        int start = 2;

        while (start < number) {

            if(number%start == 0) {
                isPrime = false;
                break;
            }
            start++;
        }

        if (isPrime) {
            System.out.println("Given number is prime");
        }
        else {
            System.out.println("Given number is not prime");
        }

    }
}
