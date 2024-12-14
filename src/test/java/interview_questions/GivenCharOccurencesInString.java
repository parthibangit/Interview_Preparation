package interview_questions;

public class GivenCharOccurencesInString {

    /*
    * Find the char-count in given string in array.
    * Input: String[] values = {"Sathish", "Parthiban", "Sambal", "Sams"} and char occurence = 's'
    * Output: Sathish 2, Sambal 1, Sams 2
    *
    * */

    public static void main(String[] args) {
       countCharOccurences();
    }

    public static void countCharOccurences() {

        String[] values = {"Sathish", "Parthiban", "Sambal", "Sams"};
        char valueToCheck = 's';

        for (int i=0; i<values.length; i++) {

            int counter = 0;
            String value = values[i];

            if(value.toLowerCase().contains(String.valueOf(valueToCheck).toLowerCase())) {

                for (int j = 0; j < value.length(); j++) {

                    if (value.toLowerCase().charAt(j) == valueToCheck) {

                        counter++;
                    }
                }
            }

            if(counter > 0) {

                System.out.println(value +" "+ counter);
            }

        }

    }
}
