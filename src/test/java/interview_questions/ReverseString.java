package interview_questions;

public class ReverseString {

    public static void main(String[] args) {
       String reversedValue = reverseString("I am Parthiban. I am an automation Engineer.");
       System.out.println(reversedValue);
    }

    public static String reverseString(String value) {

        // Input - I am Parthiban. I am an automation Engineer.
        // Output - Engineer automation an am I. Parthiban am I.

        String replacedString = value.replaceAll("[.]", "");
        String[] arr = replacedString.split(" ");
        StringBuffer buffer = new StringBuffer();

        for(int i=arr.length-1; i>=0; i--) {

            if(arr[i].equalsIgnoreCase("I")) {
                String appendValue = ". ";
                buffer.append(arr[i]+appendValue);
            }
            else {
                buffer.append(arr[i]+" ");
            }
        }

        return buffer.toString();
    }
}
