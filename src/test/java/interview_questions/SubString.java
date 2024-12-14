package interview_questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubString {

    /*
    * Find the substring which has maximum count with non-repeating characters.
    * Input: "abcdefasdsd"
    * Output: "bcdefas"
    * */


    public static void main(String[] args) {

        String value = "abcdhjaiowieoposlkjjdsdulkkdu";
        String[] arr = value.split("");
        String subString = null;
        Map<Integer, String> map = new HashMap<>();
        int counter;

        for(int i=0; i<arr.length; i++) {

            boolean flag = true;
            counter = i;
            List<String> list = new ArrayList<>();
            StringBuilder buffer = new StringBuilder();

            while (arr.length > counter && flag ) {

                if (!list.contains(arr[counter])) {
                        buffer.append(arr[counter]);
                }
                else {
                    flag = false;
                }
                list.add(arr[counter]);
                counter++;
            }
            map.put(i, buffer.toString());
        }

        int size = 0;

        for(Map.Entry<Integer, String> values: map.entrySet()) {

            if(values.getValue().length() > size) {
                subString = values.getValue();
                size = values.getValue().length();
            }
        }

        System.out.println(subString);
    }
}
