package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stream_Terminate_Operations {


    public static void main(String[] args) {

//        iterateValues();
//        findFirst();
        findAny();
//        allMatch();
//        anyMatch();
    }

    public static void iterateValues() {

        List<Character> chars = new ArrayList<>();
        chars.add('a'); chars.add('b'); chars.add('c');

        chars.stream().forEach(System.out::println);
    }

    public static void reduce() {

        List<Character> chars = new ArrayList<>();
        chars.add('a'); chars.add('b'); chars.add('c');

        //chars.stream().reduce()
    }

    public static void findFirst() {

        List<Character> chars = new ArrayList<>();
        chars.add('a'); chars.add('b'); chars.add('c');

        Optional<Character> optional = chars.stream()
                .skip(1)
                .findFirst();
        System.out.println(optional.get());
    }

    public static void findAny() {

        List<Character> chars = new ArrayList<>();
        chars.add('a'); chars.add('b'); chars.add('c');

        Optional<Character> optional = chars.stream()
                .findAny();
        System.out.println(optional.get());
    }

    public static void allMatch() {

        List<Character> chars = new ArrayList<>();
        chars.add('a'); chars.add('b'); chars.add('c');

        boolean status = chars.stream().allMatch(value -> value.equals('a'));
        System.out.println(status);
    }

    public static void anyMatch() {

        List<Character> chars = new ArrayList<>();
        chars.add('a'); chars.add('b'); chars.add('c');

        boolean status = chars.stream().anyMatch(value -> value.equals('a'));
        System.out.println(status);
    }
}
