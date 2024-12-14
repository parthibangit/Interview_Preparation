package interview_questions;

import org.testng.Assert;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareLists {


    public static void main(String[] args) {

        compare();
    }


    public static void compare() {

        List<String> list = Arrays.asList("Parthiban", "Sarathi", "Auto", "Manual");
        List<String> ascendingOrderList = Arrays.asList("Auto", "Manual", "Parthiban", "Sarathi");
        Collections.sort(list);
        Assert.assertEquals(ascendingOrderList, list, "Column not sorted properly as ascending");
        System.out.println("Column sorted properly as ascending");

        List<String> descendingOrderList = Arrays.asList("Sarathi", "Parthiban", "Manual", "Auto");
        Collections.reverse(list);
        Assert.assertEquals(descendingOrderList, list, "Column not sorted properly as descending");
        System.out.println("Column sorted properly as descending");
    }
}
