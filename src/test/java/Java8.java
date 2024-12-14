import org.apache.commons.lang3.RandomStringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

public class Java8 {

    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(10, 20, 10, 30, 10);
//        predicate(list);
////
////        List<String> listString = Arrays.asList("Parthiban", "Sarathi");
////        consumer(listString);
//
//        streams();
        supplier();
    }

    public static void streams() {

        List<String> list = List.of("Sarathi", "Parthiban", "Vetri");
        Set<String> set = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println(set);
    }


    // Predicate used to filter the values in collection.
    public static void predicate(List<Integer> list) {

        Predicate<Integer> find = value -> value == 10;
        list.stream()
            .filter(find)
            .forEach(System.out::println);
    }

    // consumer used to transform the values in collection.
    public static void consumer(List<String> list) {

        Consumer<List<String>> processData = lists -> lists.stream().map(String::toLowerCase).forEach(System.out::println);
        processData.accept(list);
    }

    public static void supplier() {

        Supplier<String> testData = () -> {

            String randomValue = RandomStringUtils.randomAlphabetic(6);
            return "Random "+randomValue;
        };

        System.out.println(testData.get());
    }
}
