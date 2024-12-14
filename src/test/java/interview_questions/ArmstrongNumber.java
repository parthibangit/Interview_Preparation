package interview_questions;

public class ArmstrongNumber {

    public static void main(String[] args) throws Exception {
       findArmstrong(153);
    }

    public static void findArmstrong(int number) throws Exception {

        int sum = 0;
        int remainder;
        int temp = number;

        if(number <= 1) {
            throw new Exception("Give number is not valid...");
        }

        while(number != 0) {

            remainder = number%10;
            number = number/10;
            sum = sum+remainder*remainder*remainder;
        }

        if (temp == sum) {
            System.out.println("Given value is armstrong number");
        }
        else {
            System.out.println("Given value is not armstrong number");
        }


    }
}
