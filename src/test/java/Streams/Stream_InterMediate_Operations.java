package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Stream_InterMediate_Operations {

    public static void main(String[] args) {
//       filter();
//       map();
//       sort();
//       distinct();
       peek();
    }


    // filter() method used to filter the value from given collection
    public static void filter() {

        List<String> list = new ArrayList<>();
        list.add("Parthiban"); list.add("Sarathi"); list.add("Vetri");

        List<String> filterdList = list.stream()
                .filter(value -> value.equalsIgnoreCase("Sarathi"))
                .collect(Collectors.toList());
        System.out.println(filterdList);
    }

    // map() method used to transform the value from given collection
    public static void map() {
        List<String> list = new ArrayList<>();
        list.add("Parthiban"); list.add("Sarathi"); list.add("Vetri"); list.add("Vetri");

        List<String> filterdList = list.stream()
                .filter(value -> value.equalsIgnoreCase("vetri"))
                .map(value -> value.substring(0).toLowerCase())
                .collect(Collectors.toList());
        System.out.println(filterdList);
    }

    // sorted() method used to sort the value from given collection
    public static void sort() {
        List<String> list = new ArrayList<>();
        list.add("Parthiban"); list.add("Sarathi"); list.add("Vetri"); list.add("Vetri");

        List<String> filterdList = list.stream()
                .sorted(Collections.reverseOrder())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filterdList);
    }

    // distinct() method used to sort the value from given collection
    public static void distinct() {
        List<String> list = new ArrayList<>();
        list.add("Parthiban"); list.add("Sarathi"); list.add("Vetri"); list.add("Vetri");

        List<String> filterdList = list.stream()
                .distinct()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filterdList);
    }

    // peek() method used to add the value to different collection
    public static void peek() {

        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        list.add("Parthiban"); list.add("Sarathi"); list.add("Vetri"); list.add("Vetri");

        List<String> filterdList = list.stream()
                .map(String::toUpperCase)
                .peek(set::add)
                .collect(Collectors.toList());
        System.out.println(filterdList);
        System.out.println(set);

    }


}
