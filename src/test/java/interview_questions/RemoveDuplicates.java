package interview_questions;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        removeDup();
        removeSpace();
        removeExtraSpaceBetween();
        removeSpecialChars();
    }

    public static void removeDup() {

        String name = "Parthiban";
        String[] arr = name.split("");
        Set<String> buffer = new LinkedHashSet<>();
        for(String string:arr) {
            buffer.add(string);
        }
        String joined = String.join("", buffer);
        System.out.println(joined);
    }

    public static void removeSpace() {
        String name = " Parthiban Subburam ";
        System.out.println(name.strip());
    }

    public static void removeExtraSpaceBetween() {

        String name = "Parthiban  Subburam";
        String removed = name.replaceAll("\\S+", " ");
        System.out.println(removed);
    }

    public static void removeSpecialChars() {

        String name = "Parthiban@123456";
        String removed = name.replaceAll("[^0-9a-zA-Z]", "");
        System.out.println(removed);
    }


}
