package interview_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSubElementsTotal {

    public static void main(String[] args) {

        findTotal(10);
    }

    public static void findTotal(int value) {

        int[] values = {10, 8, 3, 2, 5, 6, 4, 5};
        List<Integer> list = Arrays.stream(values).boxed().collect(Collectors.toList());

        for(int i=0; i<values.length; i++) {

            if(values[i] == value) {

                System.out.println(values[i]);
            }

            for (int j=i+1; j<list.size(); j++) {

                int total = values[i] + values[j];

                if(total == value) {
                    System.out.println(values[i]+" "+values[j]);
                }
            }

        }

    }

}
