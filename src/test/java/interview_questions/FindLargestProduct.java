package interview_questions;

public class FindLargestProduct {


    public static void main(String[] args) {

        int[] values = {3, 6, 5, 4, 8};
        int max = values[0]*values[1];

        for (int i=2; i<values.length; i++) {

            if(max < values[i-1]*values[i]) {
                max = values[i-1]*values[i];
            }
        }

        System.out.println(max);

    }
}
