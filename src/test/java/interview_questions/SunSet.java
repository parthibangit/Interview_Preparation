package interview_questions;

import java.util.ArrayList;
import java.util.List;

public class SunSet {

    public static void main(String[] args) {

        int[] buildingSize = {4, 6, 5, 7, 9, 6, 12};
        int maxBuildingSize = 0;
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<buildingSize.length; i++) {

            int value = buildingSize[i];

            if(value > maxBuildingSize) {
                maxBuildingSize = value;
                list.add(value);
            }
        }

        System.out.println(list);
    }
}
