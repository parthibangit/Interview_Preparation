package interview_questions;

import java.text.DecimalFormat;

public class Format {


    public static void main(String[] args) {
        //decimalConverter();
        replaceString();
    }

    private static void decimalConverter() {
        double doub = 2090890;
        DecimalFormat format = new DecimalFormat();
        String value = format.format(doub);
        System.out.println(value);

        String replaced = value.replace(",", " ");
        System.out.println(replaced);

    }

    public static void replaceString() {
        String value = "123-09-10";
        String replaced = value.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(replaced);

    }
}
