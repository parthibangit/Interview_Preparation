package interview_questions;

import java.util.ArrayList;
import java.util.List;

public class AddTwoDigits {

    public static void main(String[] args) {
        addDigits(34);
        checkSingleDigit();
    }

    public static void addDigits(int value) {

        int remainder = value%10;
        int divide = value/10;
        int sum = remainder+divide;
        System.out.println(sum);
    }

    public static void checkSingleDigit() {

        int[] array = {18, 8, 34, 45, 3, 4};
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<array.length; i++) {

            if(array[i]%10 == array[i]) {

                list.add(array[i]);
            }
        }

        if (list.isEmpty()) {
            System.out.println("There is no single digit in list");
        }
        else {
            System.out.println("Single digit values are: "+ list);
        }
    }
}
